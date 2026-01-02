class RangeArmstrongMethod
{
	public static void main(String[] args) 
	{
      rangeOfArmstrong(1,10000);
	}
	
	public static void rangeOfArmstrong(int start, int end)
	{
		while(start<=end)
		{
			if(isArmstrong(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	
	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum = 0;
		
		for(int i=num; i!=0; i/=10)
		{
			sum += power(i%10,ct);
		}
		return num == sum;
	}
	
	public static int power(int base, int raise)
	{
		int pow = 1;
		
		while(raise>0)
		{
			pow*=base;
			raise--;
		}
		return pow;
	}
	
	public static int count(int num)
	{
		int ct = 0;
		
		for (;num!=0 ;num/=10 )
		{
			ct++;
		}
		return ct;
	}
}
