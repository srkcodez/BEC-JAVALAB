class A
{

	final void display()
	{
		System.out.println("version 1");

	}


}

class B extends A
{

	void display()
	{
		System.out.println("version 2");

	}


}



class AbstractEx
{
	public static void main(String arg[])
	{

		A ob1=new A();

		ob1.display();

		ob1=new B();

		ob1.display();

		final int a=10;

		a=25;


	}

}