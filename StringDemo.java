import java.util.Scanner;

class StringDemo
{
	public static void main(String ar[])
	{

		Scanner sc=new Scanner(System.in);

		String s1=sc.nextLine();
		System.out.println(s1.charAt(0));		


		if(s1.equals("hello"))
		{

			System.out.println("same");

		}

		System.out.println(s1.replace('e','k'));

		



	}

}