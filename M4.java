//the program starts with main method
//the flow of program is controlled by main method
//the program ends at main method

class M4
{
	public static void main(String[] args) 
	{
      System.out.println("main begins");
	  abc();
	  System.out.println("main ends");
	}
	
	public static void abc()
	{
		System.out.println("From abc()");
		xyz();
		System.out.println("abc ends");
	}
	
	public static void xyz()
	{
		System.out.println("From xyz()");
	}
}
