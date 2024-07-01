package hConstructor;

public class Sample7 //user defined constructor with multiple constructor i.e. constructor overloading
{
	 int num1;
	 int num2;
	 String name;
	 
	 Sample7()
	 {
		 num1=10;
		 num2=20;
	 }
	 Sample7(int a, int b)
	 {
		 num1=a;
		 num2=b;
	 }
	 Sample7(String c)
	 {
		 name=c;
	 }
	 public void add() 
	 {
		System.out.println(num1+num2);
	}
	 public void Sname() 
	 {
		System.out.println(name);
	}
	 
	 public static void main(String[] args) 
	 {
		 Sample7 S1=new Sample7();
		 S1.add();
		 
		 Sample7 S2=new Sample7(5, 6);
		 S2.add();
		 
		 Sample7 S3=new Sample7("shradha");
		 S3.Sname();
		 
		 Sample7 S4=new Sample7("monali");
		 S4.Sname();
		 
		 
	}

}
