class A
{
	int a;   //instant variable
	int b;
	A(int c,int d)
	{
		a=c;
		b=d;
	}
}
		int m1()
		{
		return a;
		}
		int m2()
		{
		return b;
		}
		
		class Test1
		{
		public static void main(String[]args)
		{
			A r =new A(20,20);
			System.out.println(r);
			System.out.println(r.m1());
			System.out.println(r.m2());
			}
			}
			
	