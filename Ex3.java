import java.util.Scanner;

class Ex3
{
	public static void main(String arg[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i value");
		i=sc.nextInt();
		switch(7.5)
		{
			case 0: System.out.println("Sunday"); 
			case 1: System.out.println("monday"); 
			case 2: System.out.println("tuesday"); 
			case 3: System.out.println("wednesday"); 
			case 4: System.out.println("thurs day"); 
			case 5: System.out.println("friday"); 
			case 6: System.out.println("Satday"); break;
			default: System.out.println("Invalid day");

		}		

	}
}