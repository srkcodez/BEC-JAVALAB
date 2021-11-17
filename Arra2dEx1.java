import java.util.Scanner;

class Arra2dEx1
{

	public static void main(String ar[])
	{
		//datatype vn[][]=new datatype[rows][cols]

		int mat1[][]={{1,2,3},{4,5,6},{7,8,9}};
		


		System.out.println(mat1[0][2]);

		Scanner sc=new Scanner(System.in);

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat1[i][j]=sc.nextInt();

			}

		}



		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t"+mat1[i][j]);
			}

			System.out.println();
		}

		
		



	}
}