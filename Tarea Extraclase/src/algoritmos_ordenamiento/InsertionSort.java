package algoritmos_ordenamiento;

	import estructurasDeDatos.SimpleLinkedList;

	public class InsertionSort {
		
		public void sort(SimpleLinkedList<Integer> lista) 
	    { 
	        int n = lista.getLength(); 
	        for (int i = 1; i < n; ++i) { 
	        	
	        	int key = lista.get(i).getData();
	            int j = i - 1; 
	  
	            while (j >= 0 && lista.get(j).getData() > key) { 
	            	lista.set(j+1, lista.get(j).getData());
	                j = j - 1; 
	            } 
	            lista.set(j+1, key);
	        } 
	    } 
		
		public static void main(String[] args) {
			InsertionSort i = new InsertionSort();
			
			SimpleLinkedList<Integer> lista = new SimpleLinkedList<Integer>();
			lista.addLast(4);
			lista.addLast(21);
			lista.addLast(13);
			lista.addLast(56);
			lista.addLast(23);
			lista.addLast(1);
			System.out.println("Antes:");
			lista.printList();
			i.sort(lista);
			System.out.println("Después");
			lista.printList();
			
			
		}

	}


