package estructurasDeDatos;

public class SimpleLinkedList <T>{  /**
     * SimpleLinkedList class attributes.
     */
    public Node<T> first;
    public int len;
   
    /**
     * SimpleLinkedList constructor declaration.
     */
    public SimpleLinkedList() {
            first = null;
            len = 0;
    }
   
    /**
     * Method that let you know if the list is empty or not.
     * @return True or False.
     */
    public boolean isEmpty() {
            return first == null;
    }
   
    /**
     * Method that gives you the length of the list.
     * @return Length of the list.
     */
    public int getLength() {
            return len;
    }
   
    /**
     * Method that inserts a new Data at the front of the list.
     * @param Data
     */
    public void addFront(T Data) {
            Node<T> newNode = new Node<T>();
            newNode.setData(Data);
           
            if(isEmpty()) {
                    first = newNode;
                    first.setPosition(0);
            }
            else {
                    Node<T> aux = first;
                    while(aux!=null) {
                            aux.setPosition(aux.getPosition()+1);
                            aux = aux.getNext();
                    }
                    newNode.setNext(first);
                    first = newNode;
                    first.setPosition(0);
            }
            len++;
    }
   
    /**
     * Method that deletes the item at the front.
     */
    public void deleteFront() {
            if(isEmpty()) {
                    first = null;
            }else {
                    Node<T> aux = first;
                    if(getLength()!=1) {
                    while(aux!=null) {
                            aux.setPosition(aux.getPosition()-1);
                            aux = aux.getNext();
                            }
                    }
                    first = first.getNext();
            }
            len--;
    }
   
    /**
     * Method that inserts a new Data at the end of the list.
     * @param Data
     */
    public void addLast(T Data) {
            Node<T> newNode = new Node<T>();
            newNode.setData(Data);
            if(isEmpty()) {
                    first = newNode;
                    first.setPosition(0);
            }
            else {
                    Node<T> aux = new Node<T>();
                    aux = first;
                    while(aux.getNext()!=null) {
                            aux = aux.getNext();
                    }
                    aux.setNext(newNode);
                    newNode.setPosition(getLength());
            }
            len++;
    }
   
    /**
     * Method that delete the last Data at the end of the list.
     */
    public void deleteLast() {
            Node<T> aux = new Node<T>();
            aux = first;
            if(isEmpty() || len == 1 ) {
                    first = null;
            }
            else {
                    while(aux.getNext().getNext()!=null){
                            aux = aux.getNext();
                    }
            aux.setNext(null);
            }
            len--;
    }
   
    /**
     * Method that deletes an object from the list by specifying it.
     * @param t
     */
    public void deleteByElement(T t) {
            Node<T> aux = new Node<T>();
           
            aux = first;
            if(isEmpty()) {
                    first = null;
            }
            else if(first.getData()==t){
                    deleteFront();
            }
            else {
                    if(aux.getNext() == null) {
                            aux = aux.getNext();
                    }
                    while(aux.getNext()!=null) {
                            if(aux.getNext().getData()==t){
                                    aux.setNext(aux.getNext().getNext());
                            }
                            else {
                                    aux = aux.getNext();
                            }
                    }
            }len--;
    }
   
    /**
     * Method that displays the elements of the list on console.
     */
    public void printList() {
            Node<T> aux = first;
            while(aux!= null) {
                    System.out.println(aux.getData().toString());
                    aux = aux.getNext();
            }
    }
   
    /**
     * Set the element on the specified index.
     * @param index
     * @param value
     */
    public void set(int index, T value) {
		try {
			if(index == 0) {
				this.first.setData(value);
				return;
			}
			else if(index == getLength()) {
				Node<T> aux = first;
				while(aux.getNext()!=null) {
					aux = aux.getNext();
				}
				aux.setData(value);
				return;
			}
			Node<T> aux2 = first;
			while(aux2!=null) {
				if(aux2.getPosition() == index) {
					aux2.setData(value);
					break;
				}
				aux2 = aux2.getNext();
			}
		}catch(Exception e) {
			System.out.println("Está tratando de ingresar el número en un índice mayor que el largo de la lista");
		}
	}
    
   
    /**
     * Returns the element on the specified index.
     * @param index
     * @return node that's on the index
     */
    public Node<T> get(int index){
            Node<T> aux = first;
            while(aux!=null) {
                    if(index == aux.getPosition()) {
                            return aux;
                    }
                    aux = aux.getNext();
            }
            System.out.println("Index out of bounds. INDEX" + index);
            return null;
    }
   
    /**
     * Returns the first element of the list.
     * @return first
     */
    public Node<T> getFirst() {
            return first;
    }
   
    /**
     * Allows you to get the last item of the list.
     * @return
     */
    protected Node<T> getLast(){
            Node<T> aux = first;
            while(aux.getNext()!=null) {
            aux = aux.getNext();
            }
            return aux;
    }
    /**
     * Let you know if the item is on the list.
     * @param t
     * @return ans
     */
    public boolean contains(T t) {
            Node<T> aux = first;
            boolean ans = false;
            while(aux!=null) {
                    if(aux.getData().equals(t)) {
                            ans = true;
                    }aux = aux.getNext();
            }return ans;
    }
   
   
    public static void main(String[] args) {
            SimpleLinkedList<Integer> lista = new SimpleLinkedList<Integer>();
           
            lista.addLast(1);
            lista.addLast(2);
            lista.addLast(3);
            lista.addLast(4);
           
            lista.set(2,877);
    
            lista.printList();
           
           
           
    }
	

}
