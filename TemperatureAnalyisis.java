import java.util.Scanner;

class TemperatureAnalyisis
{

	public static void main(String argp[])
	{
		//datatype vaname[]=new datatype[size]; declaration
		float temp[]={0.0f,0.0f,0.0f,0.0f,0.0f,0.0f,0.0f};
		System.out.println("number of elements are"+temp.length);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<temp.length;i++)
		{
			System.out.print("Enter "+(i+1)+ " day temperature:");
			temp[i]=sc.nextFloat();
			
		}


		//for each loop
		/*

			for( datatype vn:array)
			{

			}
		for(int i=0;i<temp.length;i++)
		{
			System.out.print("\t"+temp[i]);
		}

		*/

		

		for(float i:temp)
			System.out.print("\t"+i);


		//sum of the temperature in a week
		
		float sum=0;
		for(float i:temp)
			sum+=i;

		System.out.println("sum of temp"+sum);

		//maximum temperature of in a week

		float max=temp[0];

		for(float i:temp)
		{
			if(i>max)
				max=i;
		}

		System.out.println("Maximum is "+max);

		// minimum temperature in a week


		float min=temp[0];
		
		for(float i:temp)
		{
			if(i<min)
				min=i;
		}

		System.out.println("Minimum is "+min);






	}

}



/*

	average temperature?

	day corresponding temperature?

	temperature is greater than 25


*/