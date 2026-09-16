class A
{
	int i ;
	int j;
	int k;
	A (int i)
	{
	this .i =i;
	}
	A (int i,int j)
	{
	this .i =i;
	this .j =i;
	}
	A (int i;int j;int k )
	{
	this .i=i;
	this.j=j;
	this .k=k;
	}
	
	void m()
	{
	System.out.println(i+j+k);
	}
}
	
	class overloadingconstructive
	{
		public static void main(String[] args)
		{
			A b = new A(10);
			b.m();
			A c =new A (10,20);
			c.m();
			A d=new A(50,60,70);
			d.m();
		}
	}
	
	
	
	

