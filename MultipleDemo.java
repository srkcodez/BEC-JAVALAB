class Mouse
{
	void click()
	{
		System.out.println("mouse clicked");

	}

}

interface MouseAdapter
{
	int a=34;
	void move();

}

interface MouseMotionAdapter
{

	void entered();
	void exited();

}


class MyThread implements Runnable
{

	public void run()
	{


	}


}

class MyMouse extends Mouse implements MouseAdapter,MouseMotionAdapter
{

	public void move()
	{

		System.out.println("move");
	}
	public void entered()
	{

		System.out.println("entered");
	}
	public void exited()
	{

		System.out.println("Exited");
	}


}

class MultipleDemo
{

	public static void main(String arg[])
	{

		MyMouse ob=new MyMouse();

		ob.click();
		ob.move();
		ob.entered();
		ob.exited();



	}
}

