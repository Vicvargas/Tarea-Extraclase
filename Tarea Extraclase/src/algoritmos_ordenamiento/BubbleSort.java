package algoritmos_ordenamiento;

import estructurasDeDatos.SimpleLinkedList;
import estructurasDeDatos.Node;


public class BubbleSort implements java.io.Serializable{

		public static void main(String args[]) {
			SimpleLinkedList<Integer> lista = new SimpleLinkedList <Integer>();
			
		
		  lista.addLast(4); lista.addLast(2); lista.addLast(9); lista.addLast(6);
		  lista.addLast(23); lista.addLast(12); lista.addLast(34); lista.addLast(0);
		  lista.addLast(1); lista.addLast(866); lista.addLast(3); lista.addLast(-2);
		 
			lista.printList();
			System.out.println();
			System.out.println("Lista Ordenada");
			System.out.println();
			BubbleSort ob = new BubbleSort(); 
	        ob.bubbleSort(lista);
			lista.printList();
			
		}
		
		public static void bubbleSort(SimpleLinkedList<Integer> lista) {
	        if (lista.getLength() > 1) {
	            for (int i = 0; i < lista.getLength(); i++ ) {
	                Node<Integer> currentNode = (Node<Integer>) lista.first;
	                Node next = lista.first.getNext();
	                for (int j = 0; j < lista.len- 1; j++) {
	                    if ((int)currentNode.getData() > (int)next.getData()) {
	                    	int temp = (int) currentNode.getData();
	                        currentNode.setData((Integer) next.getData());
	                        next.setData(temp);
	                    }
	                    currentNode = next;
	                    next = next.getNext();                   
	                }
	            }
	        }
	    }
	}