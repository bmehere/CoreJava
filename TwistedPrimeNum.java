import java.util.Scanner;
class TwistedPrimeNum 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
	 int num = sc.nextInt();
	 int den = 2;
	 
	 while(den<num)
		{
		if(num%den==0)
			{
			 break;
			}
			den++;
		}
		if(den==num)
		{
		int rev = 0;
		for(int i=num; i!=0; i/=10)
		{
			rev = rev*10 + (i%10);
		}
		 int den2 = 2;
		 
		 while(den2<rev){
			if(rev%den == 0){
				break;
		 }
		 den2++;
		 }
		if(rev==den2)
		{
		System.out.println("Twisted prime Number");
		}
		else
		{
		System.out.println("Not Twisted prime Number");
		}
	}
		else 
			{
				System.out.println("Number is not prime");
		     }
			
	}
}
