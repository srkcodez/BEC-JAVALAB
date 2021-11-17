class BitwiseEx
{
	public static void main(String args[])
	{
		int a=0b01,b=0b11,sa=-5;
		int c=a&b;
		int d=a|b;
		int e=~a;
		int f=a^b;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println("c is"+c+" "+Integer.toBinaryString(c));
		System.out.println("d is"+d+" "+Integer.toBinaryString(d));
		System.out.println("e is"+e+" "+Integer.toBinaryString(e));
		System.out.println("f is"+f+" "+Integer.toBinaryString(f));

		Integer san=sa>>1;
		System.out.println(sa+" "+san+ Integer.toBinaryString(san));

		Integer sann=sa>>>1;
		System.out.println(sa+" "+sann+ Integer.toBinaryString(sann));
		

	}

}