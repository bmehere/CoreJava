import java.util.Scanner;
class CharCase 
{
	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Aplhabet");
	 
	 char ch = sc.next().charAt(0);
	 
	 if(ch>='a' && ch<='z')
		{
		 System.out.println("Lowecase Alphabet");
		}
		else if(ch>='A' && ch<='Z')
		{
		 System.out.println("Uppercase Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
		 System.out.println("Digits");
		}
		else
		{
		System.out.println("Special Character");
		}
		
	}
}
