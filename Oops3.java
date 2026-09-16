class A 
{
	int i =10;
	int j= 20;
	void m1()
	{
	System.out.println("super class method");
	}
	}
	class B extends A
	{
		int k =34;
		void m2()
		{
			System.out.println("c class method");
			}
	}
		class Oops3
		{
		public static void main(String[] args)
		{
		B b =new B ();
		b.m1();
		b.m1();
		b.m2();
		System.out.println(b.i);
		System.out.println(b.j);
		system.out.println(b.k);
		}
		}
		
		