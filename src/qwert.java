

public class qwert {



	
	int amount;
	int balance; 
	
	public qwert(int balance)
	{
		this.balance=balance;
	}
	public int deposit(int amount)
	{
		balance=balance+amount;
		return balance;
	}
	public int getBal()
	{
		return balance;
	}


}
