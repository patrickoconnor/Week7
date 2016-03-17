import java.util.Scanner;



public class Week7 
	{
	
		//Example XML input and data display from class.
		public Week7() 
			{
				Scanner input = new Scanner(Week7.class.getResourceAsStream("input.dat"));
				String fileContents = "";
				while(input.hasNextLine())
					{
						fileContents += input.nextLine();
					}
				
				System.out.println(fileContents);
				
			}
		
	}