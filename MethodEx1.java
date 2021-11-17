import java.util.Scanner;
class MethodEx1
{

	public static void main(String args[])
	{
		display(30);//actual parameters
		int res=add(10,20);
		System.out.println(res);
		System.out.println(add(400,500));
		System.out.println(readInt());

	}

	public static void display(int a)//formal parameters
	{
		System.out.println("Welcome to learn fast with rk");
		System.out.println("Thank you for visiting");
		System.out.println(a);
	}

	public static int add(int a,int b)
	{
		return(a+b);


	}

	public static int readInt()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");	
		return(sc.nextInt());		

	}

	/*


		method : is a named block of statements

		method increases the modularity,readability


		visibility type return type method name (parameterlist)
		{



		}

		no arguments no return values
		arguments no return values
		arguments and return values
		no arguments but return values
		



	*/



}