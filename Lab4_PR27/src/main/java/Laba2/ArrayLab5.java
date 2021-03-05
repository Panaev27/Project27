package Laba2;

public class ArrayLab5 {
	static public int[] randomArray() {
		int[] retArr= new int[9];
		RandomNik randomizer = new RandomNik();
		for (int i=0;i<9;i++) {
			retArr[i] = randomizer.randomNumber();
		}
		return retArr;
	}
}
