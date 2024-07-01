package dConditionalStatements;

public class Example4 
{
	public static void main(String[] args) 
	{
		int pre=350; // need 300 to pass
		int mains=500; // and 800
		
		if(pre>=300)
		{
			System.out.println("Eligible for mains");
			
			if(mains>=800)
			{
				System.out.println("Selected in mains");
			}
			else
			{
				System.out.println("Not selected in main");
			}
		}
		else
		{
			System.out.println("Not eligible for mains ");
		}
		
	}

}
