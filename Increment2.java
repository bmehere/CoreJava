class Increment2 
{
	public static void main(String[] args) 
	{
	int a=5, b=11, c=17,d;
	
	d = a++ + ++b - c++;
	a = ++d + b-- + a++;
	b = ++c + ++a;
	d = b++ + --d;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	}
}
