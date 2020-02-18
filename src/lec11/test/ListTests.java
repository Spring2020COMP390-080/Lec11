package lec11.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lec11.list.List;
import lec11.list.MyArrayList;

public class ListTests {

	@Test
	public void quickListTest() {
		List<String> l = new MyArrayList<String>();
		
		assertEquals(0, l.size());
		
	}
}
