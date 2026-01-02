import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int length = 0;
	int temp = num;
	
	while (num>0)
	{
		length++;
		temp/=10;
	}

}
}