package Laba2;

import java.util.Random;


public class RandomNik {
	int min = 100; // ��������� �������� ��������� - "��"
    int max = 450; // �������� �������� ��������� - "��"
    
    Random random = new Random();
       
    public int randomNumber() {
    	return random.nextInt(max -min + 1)+min; //����� ��� ���������� ���������� �����
    }

}
