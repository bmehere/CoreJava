import java.util.Scanner;
class Discount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount");
		double amt = sc.nextInt();
		if(amt>=500)
		{
			amt -=(amt*0.1);
			System.out.println("10 persent discount applied !");
		}
		System.out.println("Total bill is" + amt + "Rs");
	}
}
