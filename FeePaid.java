import java.util.Scanner;
class FeePaid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a paid student:");
		
		boolean ip = sc.nextBoolean();
		if(ip)
		{
			System.out.println("Pay the fees first");
		}
		else
		{
		System.out.println("Attend the class");
		}
	}
}
