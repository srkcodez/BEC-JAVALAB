import java.util.Scanner;
class Larger
{
	public static void main(String [] arg)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		a=sc.nextInt();
		System.out.print("Enter b value:");
		b=sc.nextInt();
		int large=a>b?a:b;
                System.out.println("Largest is :"+large);

	}
}