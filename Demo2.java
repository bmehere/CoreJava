class  Demo2
{
	public static void main(String[] args) 
	{
     int p=50, q=-30, r=10, s;
	 
	 s = --q * r++ + ++p;
     p = p++ + --r + q++;
	 q = -(--q) + --s + ++p;
	 r = r++;
	 
	 System.out.println(p);
	 System.out.println(q);
	 System.out.println(r);
	 System.out.println(s);
	 }
}
