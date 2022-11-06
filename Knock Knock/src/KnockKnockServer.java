import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class KnockKnockServer 
{

	public static void main(String[] args) throws IOException 
	{
		int port = 9999;
		int tracker = 0;
		ServerSocket server = new ServerSocket(port);
		
		while(true)//for(;;)
		{
			try
			{
				System.out.println("Server listening...");
				Socket client = server.accept();
				System.out.println("server accepted client");
				
				
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(client.getOutputStream(),true);
				
				String message;
				
							
				while((message = in.readLine()) != null)
				{
					tracker++;
					if(tracker > 3)
					{
						tracker = 1;
					}
					
					if(tracker == 1)
					{
						if(message.toUpperCase().equals("KNOCK KNOCK"))
						{
							System.out.println("Who's there?");
							out.println("");							
						}
						else
						{
							System.out.println(	"I am sorry but I do not understand.  Please tell me a knock knock joke");
							out.println("");
							tracker--;
						}
					}
						
					else if(tracker == 2)
					{
						System.out.println(message + " who?");
						out.println(message + " who?");
					}
							
					else if(tracker == 3)
					{
						System.out.println("hahaha!  Tell me another \n");	
						out.println("");	
					}
					
						
				}
				
				client.close();
			}
			catch(Exception e)
			{
				System.out.println("there was an issue");
			}
		}

	}

}
