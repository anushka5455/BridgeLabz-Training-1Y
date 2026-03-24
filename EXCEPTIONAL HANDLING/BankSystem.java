class BankSystem
{
	int balance = 10000;
	public void withdraw(int amount)
	{
		try
		{
			if(amount>balance)
			{
				throw new InsufficientBalanceException("Insufficient balance");
			}
			balance = balance - amount;
			System.out.println("amount withdrawn successfully" +balance);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println("exception handled inside method "+e.getMessage());
		}
	}
public static void main(String args[])
{
BankSystem obj = new BankSystem();
obj.withdraw();
}
}

	