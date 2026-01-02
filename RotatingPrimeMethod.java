//only one number is rotated in this program i.e 12345 --> 51234


class RotatingPrimeMethod1
{
	public static void main(String[] args) 
	{
      System.out.println(rotate(12345));
	}
	
	public static int rotate(int num)
	{
		return num%10*power(10, count(num)-1)+num/10;
	}
	
	public static int power(int base, int raise)
	{
		int pow = 1;
		
		while (raise>0)
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
