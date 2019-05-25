package algoritmos_ordenamiento;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import estructurasDeDatos.SimpleLinkedList;

class MergeSortTest {
	SimpleLinkedList<Integer>  a = new SimpleLinkedList <Integer>();
	SimpleLinkedList<Integer> b = new SimpleLinkedList <Integer>();

		public MergeSortTest() {
			a.addLast(34);
			a.addLast(3);
			a.addLast(-6);
			a.addLast(555);
			a.addLast(89);
			MergeSort merge = new MergeSort();
			merge.sort(a, 0, a.getLength()-1);
			b.addLast(-6);
			b.addLast(3);
			b.addLast(34);
			b.addLast(89);
			b.addLast(555);
			a.printList();
		}

	@Test
	void test() {
		System.out.println("======PRUEBA UNO=======");
        assertEquals(a.get(0).getData(),b.get(0).getData());

        System.out.println("======PRUEBA DOS=======");
       assertEquals( a.get(1).getData(),b.get(1).getData());
       
       System.out.println("======PRUEBA TRES=======");
       assertEquals( a.get(2).getData(),b.get(2).getData());
       
       System.out.println("======PRUEBA CUATRO=======");
       assertEquals( a.get(3).getData(),b.get(3).getData());
       
       System.out.println("======PRUEBA CINCO=======");
       assertEquals( a.get(4).getData(),b.get(4).getData());
       
}
		
	}


