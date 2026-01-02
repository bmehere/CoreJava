//we can have more than one local variable of same name in two different blocks


class M3
{
	public static void main(String[] args) 
	{
      test();
	}
	
	public static void test()
	{
		int a = 10;
		System.out.println(a);
		demo();
	}
	
	public static void demo()
	{
		double a = 34.32;
		System.out.println(a);
	}
}
