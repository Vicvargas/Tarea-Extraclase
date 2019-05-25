package algoritmos_ordenamiento;

import estructurasDeDatos.SimpleLinkedList;

public class RadixSort {
	  private SimpleLinkedList<SimpleLinkedList<Integer>> buckets = new SimpleLinkedList<SimpleLinkedList<Integer>>();
      private SimpleLinkedList<Integer> cero = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> uno = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> dos = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> tres = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> cuatro = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> cinco = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> seis = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> siete = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> ocho = new SimpleLinkedList<Integer>();
      private SimpleLinkedList<Integer> nueve = new SimpleLinkedList<Integer>();

      public void sort(SimpleLinkedList<Integer> lista, int numDigitos) {

              buckets.addLast(cero);
              buckets.addLast(uno);
              buckets.addLast(dos);
              buckets.addLast(tres);
              buckets.addLast(cuatro);
              buckets.addLast(cinco);
              buckets.addLast(seis);
              buckets.addLast(siete);
              buckets.addLast(ocho);
              buckets.addLast(nueve);

              for (int n = 1; n <= numDigitos; n++) {
                      for (int i = 0; i < lista.getLength(); i++)
                              buckets.get(getRadix(lista.get(i).getData(),n)).getData().addLast(lista.get(i).getData());;
                              int pos = 0;
                              for (int i = 0; i < buckets.getLength(); i++) {
                                      while (!buckets.get(i).getData().isEmpty()) {
                                              lista.set(pos, buckets.get(i).getData().getFirst().getData());
                                              buckets.get(i).getData().deleteFront();
                                              pos++;
                                      }
                              }
              }
      }
     
      public static int getRadix(int number, int radix) {
              return (int) (number / Math.pow(10, radix - 1)) % 10;
      }

     
      public static void main(String[] args) {
              RadixSort r = new RadixSort();
             
              SimpleLinkedList<Integer> lista = new SimpleLinkedList<Integer>();
              lista.addLast(4);
              lista.addLast(21);
              lista.addLast(13);
              lista.addLast(56);
              lista.addLast(23);
              lista.addLast(1);
             
              lista.printList();
              System.out.println("Ahora:");
             
              r.sort(lista, 2);
             
              lista.printList();
             
      }
	

}
