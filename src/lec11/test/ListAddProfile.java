package lec11.test;

import lec11.list.List;
import lec11.list.MyArrayList;
import lec11.list.MyLinkedList;

public class ListAddProfile {

	public static void main(String[] args) {
		
		for (int num_items=1000; num_items<1000000; num_items *= 2) {
			List<String> l = new MyArrayList<String>();
			
			long start = System.nanoTime();
			
			for (int i =0; i<num_items; i++) {
				l.add(0, "some item");
			}

			long end = System.nanoTime();
			
			System.out.println(num_items + ", " + ((end-start)/1000000000.0));
		}
	}
}
