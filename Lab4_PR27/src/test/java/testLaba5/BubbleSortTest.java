package testLaba5;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import Laba2.BubbleSort;
import Laba2.ArrayLab5;

public class BubbleSortTest {
	static int[] array;
	static boolean Prop = true;
	@BeforeClass
	public static void setup() {
		array = BubbleSort.bubbleSort(ArrayLab5.randomArray());
		
	}
	@Test
	public void test() {
		
		for (int i=0;i<array.length-1;i++) {
	        if (array[i]>array[i+1]) {
	            Prop=false;
	            break;
	            }
	        }
		
	}
	@AfterClass
	public static void setdown() {
	   assertTrue(Prop);
}
}