
public class EnhancedForTest 
{

	public static void main(String[] args) 
	{
		int[] intArray = new int[20];
		for(int i = 0;i<intArray.length;i++)
		{
			intArray[i] = (int)(Math.random()*100 + 1);
		}
		for(int a : intArray)
		{
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("The Average is: "+findAverage(intArray));
		System.out.println("The Smallest value is: "+findMinVal(intArray));
	}
	public static double findAverage(int[] arr)
	{
		double total = 0.0;
		for(int a:arr)
		{
			total+=a;
		}
		return total/arr.length;
	}
	
	public static int findMinVal(int[] arr)
	{
		int mini = arr[0];
		for(int a : arr)
		{
			if(mini>a)
				mini = a;
		}
		return mini;
	}

}


/**
Create a class called EnhancedForTest.java.  
This class will have a main method, one static method called findAverage, and a second static method called findMinVal.
   The findAverage method will take an int array argument and will return a double.
      The method must use an enhanced for loop (for each loop) to calculate the average of the int values in the array it takes as an argument. 
        The findMinVal method will take an array as an argument and will return an int. 
This method will also use a for each loop to find the minimum value of the integer array and return it.  

The main method should create an int array of length 20.  
 use a for loop to initialize each index of the array to a random integer on the interval [1, 100].  
 use an enhanced for loop to print each value of the array, then call the findMinVal method as well as 
 the findAverage method and display the results.  
**/
