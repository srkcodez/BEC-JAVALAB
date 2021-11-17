class BankAccount
{
	int accno;
	int balance;

	int getAccno()
	{
		return accno;
	}

	int getBalance()
	{

		return balance;
	}

	void setAccno(int ano)	
	{
		accno=ano;

	}
	void setBalance(int b)
	{

		balance=b;
	}

	void deposit(int amt)
	{

		balance+=amt;
	}
	
	void withdraw(int amt)
	{

		balance-=amt;
	}


}


class BankEx
{
	public static void main(String apples[])
	{

		BankAccount sudheer=new BankAccount();

		BankAccount supriya=new BankAccount();

		sudheer.setBalance(1000000);

		supriya.setBalance(10000);
		sudheer.withdraw(1000000);

		supriya.deposit(100);

		System.out.println(sudheer.getBalance());
		System.out.println(supriya.getBalance());




	
	

	}
}