package dConditionalStatements;

public class Example3 
{
	public static void main(String[] args) 
	{
		int marks=85;
		
		if(marks>=70)
		{
			System.out.println("Destinction");
		}
		else if(marks>60 & marks>=65)
		{
			System.out.println("1st class");
		}
		else if(marks>=50 & marks>=55)
		{
			System.out.println("2nd class");
		}
		else if(marks>=40 & marks>=45)
		{
			System.out.println("3rd class");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
