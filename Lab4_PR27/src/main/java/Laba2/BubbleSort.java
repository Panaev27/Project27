package Laba2;

public class BubbleSort {
	static public int[] bubbleSort(int[] array)
    {
      int n = array.length;
      int temp = 0;
      for(int i=0; i < n; i++) // Looping through the array length
      {
        for(int j=1; j < (n-i); j++)
        {
          if(array[j-1] > array[j])
          {

            temp = array[j-1];
            array[j-1] = array[j];
            array[j] = temp; 
          }

        }
      }
   return array;
    } 
}
