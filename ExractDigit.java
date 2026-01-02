class ExractDigit 
{
	public static void main(String[] args) 
	{
      int num = 1234567;
	  for (;num>0 ; num/=10)
	  {
		  System.out.print(num%10);
	  }
	}
}
