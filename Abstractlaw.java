class A
{
void m1()
{
System.out.println("hi");
}
void m2()
{
System.out.println("hello");
}
}
class B extends A
{
void m1()
{
System.out.println("brisha");
}
}
class  Abstractlaw
{
public static void main(String[] args)
{
A a=new B();
a.m1();
a.m2();
}
}

