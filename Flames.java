

import java.util.Scanner;

class Flames
{
	public static void main(String arg[])
	{


		Scanner inp=new Scanner(System.in);

		System.out.print("Enter first name");
		String s1=inp.nextLine();
		
		System.out.print("Enter Second name");
		String s2=inp.nextLine();

		
		StringBuffer sb1=new StringBuffer(s1);

		StringBuffer sb2=new StringBuffer(s2);

		int sl1=sb1.length();
		int sl2=sb2.length();


		for(int i=0;i<sl1;i++)
		{

			for(int j=0;j<sl2;j++)
			{
				if(sb1.charAt(i)==sb2.charAt(j))
				{
					sb1.deleteCharAt(i);
					sb2.deleteCharAt(j);
					sl1--;
					sl2--;
					break;
				}


			}

		}

		System.out.println(sb1);

		System.out.println(sb2);

		int rl=sb1.length()+sb2.length();

		


		StringBuffer flames=new StringBuffer("Flames");


		while(flames.length()!=1)
		{
			
			int pos=rl%flames.length();
			System.out.println(""+rl+" "+flames.length()+" "+pos);

			if(pos-1<=0)
				pos=flames.length();

			System.out.println(flames.charAt(pos-1));
			

			flames.deleteCharAt(pos-1);


		}

		System.out.println(flames);


	


		



	}

}