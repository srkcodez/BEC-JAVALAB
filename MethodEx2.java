import java.util.Scanner;
class MethodEx2
{

	public static void main(String ar[])
	{
		// Display menu
		displayMenu();
		// read choice
		int ch=readChoice();
		//read quantity
		int qty=readQuantity();
		// calculate bill
		int bill=calculateBill(ch,qty);//actual parameters
		// display bills
		displayBill(ch,qty,bill);
		
	}

	public static void displayMenu()//no arguments no return 
	{
		System.out.println("Enter 1 for idly ");
		System.out.println("Enter 2 for dosa ");
		System.out.println("Enter 3 for poori ");
		System.out.println("Enter 4 for chapati ");
		System.out.println("Enter 5 for parota ");
	}

	public static int readChoice()//no arguments with return type
	{
		Scanner sc=new Scanner(System.in);
		return(sc.nextInt());
	}
	public static int readQuantity()//no arguements with return type
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter quantity");
		return(sc.nextInt());
	}
	
	public static int calculateBill(int ch,int qty)//formal parameters
	{
		int bill=0;
		switch(ch)
		{
			case 1:bill=5*qty;break;
			case 2:bill=10*qty;break;
			case 3:bill=15*qty;break;
			case 4:bill=17*qty;break;
			case 5:bill=19*qty;break;
			default: System.out.println("Wrong choice");
		}
		return(bill);//transfer the control from called method to calling method

	}

	public static void displayBill(int ch,int qty,int bill)//arguments but no return value
	{

		System.out.println("Welcome to BEC Canteen");
		System.out.println("item code:\t"+ch);
		System.out.println("Quantity:\t"+qty);
		System.out.println("Bill:\t"+bill);
		System.out.println("Thank you visit again");


	}


}

