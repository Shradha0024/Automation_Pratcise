package fTypesOfVariables;

public class Demo2 
{
	 static int a=40;
	 
	 public static void main(String[] args) 
	 {
		 System.out.println(a);
		
		 A1();
		 
		 Demo2 d2=new Demo2();
		 d2.A2();
		 
		 System.out.println(Demo3.b);
	}
	  public static void A1() 
	  {
		  System.out.println(a);
		
	}
	   public void A2() 
	   {

		   System.out.println(a);
	}

}
