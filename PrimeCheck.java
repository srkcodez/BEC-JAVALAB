import java.util.Scanner;

class PrimeCheck
{
	public static void main(String arg[])
	{
		//Scanner sc=new Scanner(System.in);
		int i,n;
		for(n=500;n<900;n++)	
		{
			for(i=2;i<n/2;i++)
			{
				if(n%i==0)
					break;
			}

			if(i==n/2)
				System.out.println(n+" is prime");
			else
				System.out.println(n+ "is not a prime");			

		}
		


	}

}