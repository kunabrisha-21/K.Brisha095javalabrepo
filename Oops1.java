class A
{
int i;
int j;
A (int i,int j)
{
	this.i =i;
	this.j=j;
	}
	}
	class Oops1
	{
	public static void main(String[] args)
	{
	A a= new A (10,20);
	A a1= new A (30,40);
    A a2 =new A (50,60);
    System.out.println(a1.i);
}
}
	