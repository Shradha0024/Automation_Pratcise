package cMethods;

public class Example1 
{
	public static void main(String[] args) 
	{
		P1();
		Example2.P2();
		
		System.out.println("----------");
		
		Example1 E1=new Example1();
		E1.T1();
		
		Example2 E2=new Example2();
		E2.T2();
		
	}
	public static void P1() 
	{
		System.out.println("Static method claa from same class");
	}
	public void T1() 
	{
		System.out.println("Nonststic method call from same class");
	}
}
