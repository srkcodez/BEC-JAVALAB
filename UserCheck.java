import java.util.Scanner;


class UserCheck
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);

		String s1,s2;

		s1=sc.nextLine();

		s2=sc.nextLine();

		if(s1.equalsIgnoreCase("james bond") && s2.equals("007"))
		{
			System.out.println("Login success");

		}

		else 
		{
			System.out.println("Login fail");

		}





	}

}