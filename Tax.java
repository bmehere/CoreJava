import java.util.Scanner;
class Tax
{
	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Salary");
	 
	 float f = sc.nextFloat();
	 
	 if(f>=0 && f<=300000)
		{
		 System.out.println("Tax will be Nil");
		}
		else if(f>=300001 && f<=700000)
		{
		 System.out.println("Tax will be 5% on the salary");
		}
		else if(f>=700001 && f<=1000000)
		{
		 System.out.println("Tax will be 10% on the salary");
		}
		else if(f>=1000001 && f<=1200000)
		{
		System.out.println("Tax will be 15% on the salary");
		}
		else if(f>=1200001 && f<=1500000)
		{
		 System.out.println("Tax will be 20% on the salary");
		}
		else if(f>=1500001 && f<=5000000)
		{
		 System.out.println("Tax will be 30% on the salary");
		}
		else if(f>=5000001 && f<=20000000)
		{
		 System.out.println("Tax will be 30% on the salary");
		}
		
	}
}
