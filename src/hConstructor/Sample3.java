package hConstructor;

public class Sample3 
{
	int num1;
	int num2;
	
	Sample3() // user defined constructor also type1 : user defined constructor without parameter constructor
	{
		num1=10;  //this assigned information is fixed in user defined constructor
		num2=120;
		
	}
	public void m1() 
	{
		System.out.println(num1+num2);

	}
	public void m2() 
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) 
	{
		Sample3 S3=new Sample3();
		S3.m1();
		S3.m2();
		
		Sample4 S4=new Sample4();
          S4.m3();
     }
}