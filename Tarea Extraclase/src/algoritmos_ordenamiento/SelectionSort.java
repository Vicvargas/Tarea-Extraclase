package algoritmos_ordenamiento;

import estructurasDeDatos.Node;
import estructurasDeDatos.SimpleLinkedList;

public class SelectionSort {
	
	public static void main(String args[]) {
		SimpleLinkedList<Integer> lista = new SimpleLinkedList <Integer>();
	
	  lista.addLast(4); lista.addLast(2); lista.addLast(9); lista.addLast(6);
	  lista.addLast(23); lista.addLast(12); lista.addLast(34); lista.addLast(0);
	  lista.addLast(1); lista.addLast(866); lista.addLast(3); lista.addLast(-2);
	 
		lista.printList();
		System.out.println();
		System.out.println("Lista Ordenada");
		System.out.println();
		SelectionSort selection = new SelectionSort();
        selection.selectionSort(lista);
		lista.printList();}
		
	public void selectionSort(SimpleLinkedList<Integer> lista){
		for(Node<Integer> nodo1 = (Node<Integer>) lista.first; nodo1!=null; nodo1 = nodo1.getNext()) {
			Node<Integer> min = nodo1;
			for(Node<Integer> nodo2 = nodo1; nodo2!=null; nodo2 = nodo2.getNext()){
				if(min.getData() > nodo2.getData()){
					min = nodo2;
					}
				}
			Node<Integer> temp = new Node<Integer>();
			temp.setData(nodo1.getData());
			nodo1.setData(min.getData());
			min.setData(temp.getData());
			}
		}
	


}
