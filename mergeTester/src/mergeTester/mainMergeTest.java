package mergeTester;

public class mainMergeTest
{

	public static void main(String[] args) 
	{


		
		int[] left = {2,3,9,11}; 
		int[] right = {1,5,7,10,13,15,17};
		
		
		int[] combine = new int[right.length+left.length];
		
		int indexRight = 0;
		int indexLeft = 0;
		int indexCombine=0;

			for(int i = 0; i<combine.length;i++)
			{
				if(indexRight<right.length && indexLeft<left.length)
				{
					
					if(right[indexRight]<left[indexLeft])
					{
						combine[i] = right[indexRight];
						indexRight++;
						indexCombine++;
					}
									
					else if(right[indexRight]>=left[indexLeft])
					{
						combine[i] = left[indexLeft];
						indexLeft++;
						indexCombine++;
					}
				}
				for(int j = 0; j<combine.length;j++)
				{
					System.out.print(combine[j]+", ");
				}
				

				
				System.out.print("The left index is: " + indexLeft);
				System.out.print("\tThe right index is: " + indexRight+ "\t");

				System.out.println();

			}

			for(int i=indexLeft; i<left.length;i++)
			{

			        combine[indexCombine] = left[i];
			        indexCombine++;
			}
		 
			for(int i=indexRight; i<right.length;i++)
			{

			        combine[indexCombine] = right[i];
			        indexCombine++;
			}
			
			System.out.println();
			for(int j = 0; j<combine.length;j++)
			{
				System.out.print(combine[j]+", ");
			}
			

			
			System.out.print("The left index is: " + indexLeft);
			System.out.print("\tThe right index is: " + indexRight+ "\t");

			
			
			
			
			
			
			
			
			
			
			
			
			

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
			
			
			
			
			
			
			
			
			
			
			
			
			
			private static void merge(int[] left, int[]right, int[]arr)
			{

				int indexRight = 0;
				int indexLeft = 0;
				int indexCombine=0;

				
				while(indexRight<right.length && indexLeft<left.length)
				{
					
					if(right[indexRight]<left[indexLeft])
					{
						arr[indexCombine] = right[indexRight];
						indexRight++;
						indexCombine++;
					}
									
					else if (right[indexRight]>=left[indexLeft])
					{
						arr[indexCombine] = left[indexLeft];
						indexLeft++;
						indexCombine++;
					}
				}

					

					while(indexLeft<left.length)
					{
					        arr[indexCombine] = left[indexLeft];
					        indexLeft++;
					        indexCombine++;
					}
				 
					while(indexRight<right.length)
					{

					        arr[indexCombine] = right[indexRight];
					        indexRight++;
					        indexCombine++;
					}
			}
	}
}
