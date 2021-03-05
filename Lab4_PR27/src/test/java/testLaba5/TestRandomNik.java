package testLaba5;

import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.RandomNik;


public class TestRandomNik {

	@Test
	public void test() {
		RandomNik i = new RandomNik();
		boolean b = true;
		for(int n=0; n<10;n++) {
			double x = i.randomNumber();
			if (!((x%1 == 0) && (x >= 100) && (x <= 450))) b = false;
					
		}
		assertTrue(b);
		
		
		
	}

}
