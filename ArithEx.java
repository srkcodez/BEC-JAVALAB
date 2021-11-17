class Arith
{
	private int op1,op2,res;

	Arith(int op1,int op2)
	{
		this.op1=op1;
		this.op2=op2;
		res=0;

	}
	int add()
	{
		return(op1+op2);

	}

	int sub()
	{
		return(op1-op2);

	}

	void mul()
	{
		res=op1*op2;

	}

	void div()
	{
		res=op1/op2;

	}

	static void display()
	{

		System.out.println("hello static ");
	}



}


class ArithEx
{
	public static void main(String arg[])
	{

		Arith ob;
		ob=new Arith(500,400);

		Arith.display();
		System.out.println(ob.add());



	}

}