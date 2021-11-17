import java.util.Scanner;

class Ex2
{
	public static void main(String arg[])
	{
		
		boolean gender;
		int height;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter true for male false for female");
		gender=sc.nextBoolean();
		System.out.print("Enter hieght of the candidate");
		height=sc.nextInt();

		if(gender==true)
		{
			if(height>180)
				System.out.println("Candidate Selected");
			else
				System.out.println("Candidate not Selected");
	

		}
		else
		{
			if(height>165)
				System.out.println("Candidate Selected");
			else
				System.out.println("Candidate not Selected");
		}


		


	}
}