// TimeTest03.java
// This program tests the efficiency of a nested loop algorithm
// like the Bubble Sort.

import java.util.*;

public class TimeTest03
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		System.out.println();
		// displayList(list);

		//////////
		time.startClock();
		bubbleSort(list);
		time.stopClock();
		//////////

		// displayList(list);
		System.out.println();
		System.out.println(time);
	}


	public static void createList (int[] list, int size)
	{
		for (int k = 0; k < size; k++)
		{
			int rndInt = (int) (Math.random() * 9000 + 1000);
			list[k] = rndInt;
		}
	}


	public static void displayList(int[] list)
	{
      System.out.println();
		for (int k = 0; k < list.length; k++)
      {
			System.out.print(list[k] + "    ");
         if (k % 15 == 0)
            System.out.println();
      }
      System.out.println();
	}


  	public static void bubbleSort(int[] list)
	{
   		for (int p = 1; p < list.length; p++)
      		for ( int q = 0;  q < list.length-p; q++)
				if (list[q] > list[q+1])
				{
					int temp = list[q];
					list[q] = list[q+1];
					list[q+1] = temp;

				}
	}


}


