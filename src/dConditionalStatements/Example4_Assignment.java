package dConditionalStatements;

public class Example4_Assignment 
{
	public static void main(String[] args) 
	{
		int ShpAmt=10500;
		
		if(ShpAmt>=500)
		{
			System.out.println("no delivery charges apply");
			
			if(ShpAmt>=10000)
			{
				System.out.println("10% discount Added");
			}
			else
			{
				System.out.println("no discount");
			}
		}
		else
		{
			System.out.println("100Rs devilvery charges apply");
		}
	}

}
