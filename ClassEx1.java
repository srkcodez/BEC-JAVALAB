import java.lang.instrument.Instrumentation;
class Rectangle
{
	int len,br;

	void area()
	{


	}

	void perimeter()
	{


	}



}

class BankAccount
{


}
class MovieTicket
{


}



class ClassEx1
{
	private static Instrumentation instr;

	public static void main(String arg[])
	{
		Rectangle r1=new Rectangle();

		
		instr.getObjectSize(r1);


	}

}