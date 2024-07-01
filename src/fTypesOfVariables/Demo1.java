package fTypesOfVariables;

public class Demo1 
{
	int a=20;                        // global variable 
	
	public static void main(String[] args) 
	{
		B1();
		
		Demo1 d1=new Demo1();
		d1.B2();
		
	}
	public static void B1() 
	{
		 int b=30;                    // local variable
		  System.out.println(b);
		   
		//  System.out.println(a); // error coz var is non static and call it in static
		
	}
	public void B2() 
	{
		System.out.println(a);
	}

}
