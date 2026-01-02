class Para2 
{
	public static void main(String[] args) 
	{
      count(345);
	}
	
	public static void count(int num)
	{
		int ct = 0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		evenOdd(ct);
	}
	
	public static void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("It is even");
		}
		else
		{
			System.out.println("It is odd");
		}
	}
				
}
