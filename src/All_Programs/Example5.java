package All_Programs;

public class Example5 
{
	public static void main(String[] args) 
	{
		Sname("Gopi");
		Sname("bhuvan");
		
		Example5 E5=new Example5();
		E5.Sfullname("Ram", "Dhote"); 
		
		 
		Example4.Studentinfo("Pakhi", "Prabhu", 101,90.42f, 'B');
		
	}
	public static void Sname(String s1 )
	{
		System.out.println(s1);
	}
	public void Sfullname(String p1, String p2)
	{
		System.out.println(p1+" "+p2);
		
	}

}
