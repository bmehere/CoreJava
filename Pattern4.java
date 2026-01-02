class Pattern4
{
	public static void main(String[] args) 
	{
	   int num = 5;
	   for (int i =1 ;i<=num ; i++)
	   {
		   for (int j=1; j<=num ;j++ )
		   {
			   if(j==5 || i==5 )
				   System.out.print("*");
			   else
				   System.out.print("_");		   
		   }
		   System.out.println( );
	   }
	}
}
