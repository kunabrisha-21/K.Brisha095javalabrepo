class A
{
	int i =10;
	int j= 20;
	void m1()
	{
	System.out.println("HI");
	}
	}
	class B extends A
	{
		
		void m2()
		{
			System.out.println("HELLO");
			}
			}
			class overriding
		{
		public static void main(String[] args)
		{
		A a =new B ();
		
		System.out.println(a.i);
		System.out.println(a.j);
		a.m1();
		}
		
		}
		