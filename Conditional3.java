class Conditional3
{
	public static void main(String[] args) 
	{
      int n1 = 199;
	  int n2 = 6788;
	  int n3 = 3444;
	  
	  int largest = n1>n2 ? (n1>n3 ? n1:n3):(n2>n3 ? n2:n3);
	  System.out.println(largest);
	}
}
