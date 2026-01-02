class Automorphic 
{
	public static void main(String[] args) 
	{
		System.out.println(isAutomorphic(25));
	}
	
	public static boolean isAutomorphic(int num)
	{
		return (num*num)%power(10,count(num)) == num;
	}
	
	public static int count(int num)
	{
		int ct = 0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
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
}
