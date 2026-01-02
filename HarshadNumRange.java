import java.util.Scanner;
class HarshadNumRange
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the Start:");
	 int start = sc.nextInt();
	 
	 System.out.print("Enter the end:");
	 int end = sc.nextInt();
	 
	 for(int temp=start; temp<=end; temp++)
	{
	
	 int sum = 0, num = temp;
		 while(num>0)
			{
			 sum+=num%10;
			 num/=10;
			}
			if(temp%sum==0)
			{
				System.out.print(temp);
			}
		}
	}
}
