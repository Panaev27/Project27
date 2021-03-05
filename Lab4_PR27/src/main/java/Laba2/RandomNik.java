package Laba2;

import java.util.Random;


public class RandomNik {
	int min = 100; // Начальное значение диапазона - "от"
    int max = 450; // Конечное значение диапазона - "до"
    
    Random random = new Random();
       
    public int randomNumber() {
    	return random.nextInt(max -min + 1)+min; //Метод для возращения рандомного числа
    }

}
