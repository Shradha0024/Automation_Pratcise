package cMethods;

public class Example3 
{
	public static void main(String[] args) 
	{
		L1(10, 20);
		
		Example3 e3=new Example3();
		e3.Q1(15, 20);
		

		Example4.L2(10, 150);
		Example4.L2(45, 70);
		
		Example4 e4=new Example4();
		e4.Q2(2,4); 
		
	}
	public static void L1(int num1, int num2) 
	{
		System.out.println(num1+num2);
	}
	public void Q1(int n1, int n2) 
	{
		System.out.println(n1*n2);
	}

}
