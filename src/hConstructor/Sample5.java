package hConstructor;

public class Sample5 
{
	int num1;
	int num2;
	 
	Sample5(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public void add() 
	{
		System.out.println(num1+num2);
	}
	public void mul() 
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) 
	{
		Sample5 S1=new Sample5(10,20);
		S1.add();
		S1.mul();
		
		Sample5 S2=new Sample5(30,40);
		S2.add();
		S2.mul();
		
		Sample6 S3=new Sample6(25,35);
		S3.sub();
		S3.mul();
		
		
	}

}
