import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class textSearch 
{

	public static void main(String[] args)
	{
		try 
		{
		      File myObj = new File("List.txt");
		      Scanner myReader = new Scanner(myObj);
		      ArrayList<String> fileInfo = new ArrayList<String>(); 

		      ArrayList<String> fileTagName = new ArrayList<String>();
		      while (myReader.hasNextLine())
		      {
		        String data = myReader.nextLine();
		        String[] temp = data.split("\t");
		        if(temp[0].equals(""))
		        {
		        	
		        }
		        else
		        {
		        	fileInfo.add(temp[0]);		        	
		        }
		        fileTagName.add(temp[1]);
		      }
		      myReader.close();
		   
			
		    ArrayList<String> targetArray = new ArrayList<String>(); 
			
			for (int i = 0; i <fileInfo.size();i++)
			{
				for(int j = 0; j<fileInfo.get(i).length()-3;j++)
				{
					String subChara = fileInfo.get(i).substring(j,j+4);
					
					for(int k = 0; k<fileTagName.size();k++)
					{
						if(fileTagName.get(k).contains(subChara))
						{
							targetArray.add(fileInfo.get(i)+ "\t" + fileTagName.get(k) + "\t" + subChara);
						}
					}
				}
			}
			

			PrintWriter writer = null;
			
			try
			{
				writer = new PrintWriter("Results.txt");
			}
			catch (FileNotFoundException e)
			{
				try
				{
					File file1 = new File("Results.txt");

					file1.createNewFile();
					writer = new PrintWriter("Results.txt");
				}
				catch (IOException d)
				{

				}
			
			}
			for ( int i =0;i<targetArray.size();i++)
			{
				writer.println(targetArray.get(i));
				
			}
			writer.close();
			
	  
		}
		catch (FileNotFoundException e)
		{
		}
		

	}

}
