/**
 * @author Anshul104
 * Merge Sort 
 */

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args)
	{
		int[] start = new int[100];
		for(int i = 0; i < start.length; i++)
		{
			start[i] = (int)(Math.random()*20 + 1);
		}
		int[] sorted = Arrays.copyOf(start,start.length);
		Arrays.sort(sorted);
		mergesort(start);
		if(Arrays.equals(start, sorted))
			System.out.print("correctly sorted");
		else
			System.out.print("not properly sorted");
	}
	
	/*
	 * implement the mergesort method.  It should be a recursive
	 * implementation of the mergesort algorithm we spoke about
	 * in class.  If you run this main method it will tell you 
	 * if your algorithm properly sorted the array.  You do not 
	 * need to add any code to the main method.
	 */
	
	public static void mergesort(int[] arr)
	{
		if(arr.length==1)
		{
			return;
		}
		int[] tempArrayLeft = new int[arr.length/2];
		
		for(int i =0; i<tempArrayLeft.length; i++)
		{
			tempArrayLeft[i] = arr[i]; 
		}
		
		int[] tempArrayRight= new int[arr.length - tempArrayLeft.length];

		for(int i =0; i<tempArrayRight.length; i++)
		{
			tempArrayRight[i] = arr[i+tempArrayLeft.length]; 
		}
		
		mergesort(tempArrayLeft);
		mergesort(tempArrayRight);
		merge(tempArrayLeft,tempArrayRight,arr);		
		
		
		
	}
	
	private static void merge(int[] left, int[]right, int[]arr)
	{

		int indexRight = 0;
		int indexLeft = 0;
		int indexCombine=0;

		
		for(int i = 0; i<arr.length;i++)
		{
			if(indexRight<right.length && indexLeft<left.length)
			{
				
				if(right[indexRight]<left[indexLeft])
				{
					arr[i] = right[indexRight];
					indexRight++;
					indexCombine++;
				}
								
				else if(right[indexRight]>=left[indexLeft])
				{
					arr[i] = left[indexLeft];
					indexLeft++;
					indexCombine++;
				}
			}

		}

		for(int i=indexLeft; i<left.length;i++)
		{

		        arr[indexCombine] = left[i];
		        indexCombine++;
		}
	 
		for(int i=indexRight; i<right.length;i++)
		{

		        arr[indexCombine] = right[i];
		        indexCombine++;
		}
	}
}
















