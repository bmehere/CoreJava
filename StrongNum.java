import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the num:");
	  int num = sc.nextInt();
	  int sum = 0;
	  long fact = 1;
	  int temp = num;
	  
	  while(temp>0)
		{
		  sum+=temp%10;
		  fact = fact * sum;
		  temp/=10;
		  sum--;
		}
		if(fact==num)
		{
			System.out.println("Strong num");
		}
		else
		{
			System.out.println("Not Strong num");
		}
	}
}
