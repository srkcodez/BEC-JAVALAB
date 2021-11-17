class Rectangle
{
	int len,br;

	void area()
	{

		System.out.println(len*br);


	}
	void perimeter()
	{
		System.out.println(2*(len+br));

	}

}


class ObjectEx
{

	public static void main(String args[])
	{
		//classname objectname=new Classname();
		Rectangle r1=new Rectangle();

		r1.len=10;
		r1.br=20;

		r1.area();
		r1.perimeter();

		Rectangle bahubali=new Rectangle();
		bahubali.len=200;

		bahubali.br=300;
		bahubali.area();
		bahubali.perimeter();


		


	}

}