package hConstructor;


public class Sample1 
{
//	sample1()    default constructor-->always call in main method
//	{
//		
//	}
    public static void main(String[] args) 
    {
    	Sample1 S1=new Sample1(); //default constructor call from same class
    	S1.m1();
    	
    	Sample2 S2=new Sample2();
    	S2.m2();
		
	}
    
    
   public void m1() 
  {
	System.out.println("running method m1");
    }
	
	
}
