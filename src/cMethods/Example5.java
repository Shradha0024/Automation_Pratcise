package cMethods;

public class Example5 
{
	public static void main(String[] args) 
	{
		J1("Shradha");
		
		Example5 e5=new Example5();
		e5.k1("Rohan", "Rohit");
		
		Example6.studentInfo("Gopi",101,84.5f,'A');
		
		Example6 E6=new Example6();
		E6.sinfo("Sumi",102,74.4f,'B');
	}
	public static void J1(String s1) 
	{
		System.out.println(s1);
	}
	public void k1(String s2, String s3) 
	{
		System.out.println(s2 +" "+s3);
		
	}

}
