// cheack if digit present in number or not

class FindNumber 
{
	public static void main(String[] args) 
	{
	  int num = 235710;
	  int find = 7;
	  
	  for (;num>0; num/=10 )
	  {
		  int last = num%10;
		  if(last == find)
		  {
			  System.out.println("Number found successfully");
			  break;
		  }
		  if(num == 0)
		  System.out.println("Number not found");
	  }
	}
}
