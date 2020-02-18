package lec11.test;

import lec11.list.List;
import lec11.list.MyArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<String> l = new MyArrayList<String>();
		
		System.out.println("size = " + l.size());
		
		l.add("one fish");
		l.add("two fish");
		l.add("red fish");
		l.add("blue fish");
		
		System.out.println("size = " + l.size());
		System.out.println("second item = " + l.get(1));
		
		
	}
	
}
