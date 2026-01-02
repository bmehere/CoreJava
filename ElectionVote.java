import java.util.Scanner;
class ElectionVote
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your age");
	  byte age = sc.nextByte();
	  
	  if(age>=18)
		{
		  System.out.println("You can Vote");
		}
		else
		{
			System.out.println("You cannot Vote");
		}
     }
}
