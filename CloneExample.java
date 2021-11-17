class C1 implements Cloneable
{


}

class CloneExample
{
	public static void main(String args[])
	{


		C1 ob=new C1();

		C1 ob1=ob.clone();

		System.out.println(ob.getClass());

		System.out.println(ob.hashCode());


		System.out.println(ob1.getClass());

		System.out.println(ob1.hashCode());

		System.out.println( System.identityHashCode(ob1));

		System.out.println(ob);	

		System.out.println();	



		



	}

}
