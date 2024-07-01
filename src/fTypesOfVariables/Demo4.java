package fTypesOfVariables;

public class Demo4 
{
	 int c=70;
	 
	 public static void main(String[] args) 
	 {
		 Demo4 d4=new Demo4();
		 System.out.println(d4.c);
		 
		 G1();
		 
		 d4.G2();
		 
		 Demo5 d7=new Demo5();
		System.out.println(d7.l);
	}
	 public static void G1() 
	 {
		 Demo4 d5=new Demo4();
		 System.out.println(d5.c);
		
	}
	 public void G2() 
	 {
		 System.out.println(c);
		
	}

}
