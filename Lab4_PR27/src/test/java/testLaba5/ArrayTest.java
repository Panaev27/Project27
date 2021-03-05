package testLaba5;

import static org.junit.Assert.*;
import Laba2.ArrayLab5;

import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayTest {

	static int[] array;
	@BeforeClass
	public static void setUpBeforeClass() {
		array=ArrayLab5.randomArray();
	}
	
	@Test
	public void test() {
		boolean b= true;
		if (!array.equals(null)&&array.length==9) {
			for (int i=0;i<9;i++) {
				if (array[i]==0) {
					b=false;
					break;
				}
			}
		} else {
			b=false;
		}
		assertTrue(b);
	}
}
