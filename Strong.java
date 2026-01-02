class Strong
{
	public static void main(String[] args) 
	{
       System.out.println(isStrong(145));
	}
	public static boolean isStrong(int num)
	{
		int sum = 0;
		for(int i=num; i!=0; i/=10)
		{
			int last = i%10;
			sum = sum+factorial(last);
		}
		return num == sum;
	}
	
	public static int factorial(int num)
	{
		int fact = 1;
		while(num>0)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
	
}
