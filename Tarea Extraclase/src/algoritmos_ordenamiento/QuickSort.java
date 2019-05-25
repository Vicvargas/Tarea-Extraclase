package algoritmos_ordenamiento;

import estructurasDeDatos.SimpleLinkedList;

public class QuickSort { 
	

    public int partition(SimpleLinkedList<Integer> list, int low, int high)
    {
            int pivot = list.get(high).getData();  
            int i = (low-1); 
            for (int j=low; j<high; j++)
            {
                
                    if (list.get(j).getData() <= pivot)
                    {
                            i++;
                           
                            int temp = list.get(i).getData();
                            list.set(i, list.get(j).getData());
                            list.set(j, temp);
                    }
            }

           
            int temp = list.get(i+1).getData();
            list.set(i+1, list.get(high).getData());
            list.set(high, temp);
            return i+1;
    }


    
    public void sort(SimpleLinkedList<Integer> list, int low, int high)
    {
            if (low < high)
            {
             
                    int pi = partition(list, low, high);

                  
                    sort(list, low, pi-1);
                    sort(list, pi+1, high);
            }

    }

    public static void main(String[] args) {
            QuickSort q = new QuickSort();
            SimpleLinkedList<Integer> lista = new SimpleLinkedList<Integer>();
            lista.addLast(4);
            lista.addLast(21);
            lista.addLast(13);
            lista.addLast(56);
            lista.addLast(23);
            lista.addLast(1);
            System.out.println("Antes:");
            lista.printList();
            System.out.println("Ahora:");
            q.sort(lista, 0, lista.getLength()-1);
            lista.printList();
    }
}
