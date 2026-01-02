class ExtractEvenNumber
{
	public static void main(String[] args) 
	{
		int num = 234566;
		int last = 0;
		for (;num>0 ;num/=10 )
		{
			last = num%10;
			if(last%2==0)
			{
				System.out.println(last);
			}
		}
	}
}
