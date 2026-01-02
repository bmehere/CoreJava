class Para1 
{
	public static void main(String[] args) 
	{
       isPrime(23);
	   coPrime(2,5);
	   power(2,4);
	}
	
	public static void isPrime(int num)
	{
		int den=2;
		while(den<num)
		{
			if(num%den == 0)
			{
				break;
			}
			den++;
			
			if(num == den)
			{
				System.out.println("It is prime");
			}
			else{
				System.out.println("It is not prime");
			}
		}
	}
	
	public static void coPrime(int n1,int n2)
	{
		int small = n1 < n2 ? n1 : n2;
		while(small > 1)
		{
			if(n1%small==0 && n2%small==0)
			{
				break;
			}
			small--;
		}
	}
	
	public static void power(int base, int raise)
	{
		int pow = 1;
		while(raise > 0)
		{
			pow*=base;
			raise--;
		}
		System.out.println(pow);
	}
	
}
