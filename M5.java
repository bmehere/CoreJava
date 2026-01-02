class M5 
{
	public static void main(String[] args) 
	{
      evenOdd(10);
	  evenOdd(3);
	}
	
	public static void evenOdd(int num)
	{
		System.out.println("evenOdd begin");
		
		if(num%2 == 0)
		{
			System.out.println("it is even");
		}
		System.out.println("evenOdd end");
	}
}
