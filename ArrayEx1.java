import java.util.Scanner;

class ArrayEx1
{
	public static void main(String [] args)
	{

		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter"+(i+1)+"th element");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			System.out.println((i+1)+"th element is"+a[i]);
		}

	}

}
