package All_Programs;

public class Example1 
{
	public static void main(String[] args) 
	{
		m1();
		Example2.m2();
		
		Example1 E1=new Example1();
		E1.m3();
		
		Example2 E2=new Example2();
		E2.m4();
		
	}
	public static void m1() 
	{
		System.out.println("static method call form same class");
		
	}
	public void m3() 
	{
		System.out.println("Non static method call from same class");
		
	}

}
