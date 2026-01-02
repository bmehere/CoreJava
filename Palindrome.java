class Palindrome 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int ip = sc.nextInt();
	  
	  if(isPalindrome(ip))
		{
		  System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
		
		public static boolean isPalindrome(int num)
	{
			return num == reverse(num);
	}
	
	public static it reverse(int num)
	{
		int rev = 0;
		while(num!=0)
		{
		  rev = rev*10+(num%10);
		  num/=10;
		}
		return rev;
	}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
