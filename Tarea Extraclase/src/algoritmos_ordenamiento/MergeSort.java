package algoritmos_ordenamiento;

import estructurasDeDatos.SimpleLinkedList;

public class MergeSort {
	public void merge(SimpleLinkedList<Integer> list, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        SimpleLinkedList<Integer> listL = new SimpleLinkedList<Integer>();
        SimpleLinkedList<Integer> listR = new SimpleLinkedList<Integer>();
       
 
        for (int i=0; i<n1; ++i)
                listL.addLast(list.get(l+i).getData());
        for (int j=0; j<n2; ++j)
                listR.addLast(list.get(m+1+j).getData());
 
        int i = 0, j = 0;
       
        int k = l;
        while (i < n1 && j < n2)
        {
            if (listL.get(i).getData() <= listR.get(j).getData())
            {
                list.set(k, listL.get(i).getData());
                i++;
            }
            else
            {
                list.set(k, listR.get(j).getData());
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
                list.set(k, listL.get(i).getData());
            i++;
            k++;
        }
 
 
        while (j < n2)
        {
                list.set(k, listR.get(j).getData());
            j++;
            k++;
        }
    }
 
    void sort(SimpleLinkedList<Integer> list, int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(list, l, m);
            sort(list , m+1, r);
 
           
            merge(list, l, m, r);
        }
    }
   
    public static void main(String[] args) {
                MergeSort m = new MergeSort();
               
                SimpleLinkedList<Integer> lista = new SimpleLinkedList<Integer>();
                lista.addLast(4);
                lista.addLast(21);
                lista.addLast(13);
                lista.addLast(56);
                lista.addLast(23);
                lista.addLast(1);
                System.out.println("Antes:");
                lista.printList();
                m.sort(lista, 0, lista.getLength()-1);
                System.out.println("Después");
                lista.printList();
        }
}

   