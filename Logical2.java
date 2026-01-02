class Logical2 
{
	public static void main(String[] args) 
	{
      int n1 = 124;
	  int n2 =678;
	  int n3 = 400;
	  
	  int largest = n1>n2 && n1>n3 ? n1 :(n2>n3?n2:n3);
	  System.out.println(largest);
	}
}
