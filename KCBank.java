class KCBank
{
static double balance = 4000;;
	public static void credit(double amount)
	{
		if(balance>0.0){
			System.out.println("after credit");
			balance =balance+amount;
		}
		else
			System.out.println("invalid account balance");
		
	}
	public static void debit(double amount)
	{
		if(balance>=amount){
			System.out.println("after debit");
			balance = balance-amount;
		}
		else
			System.out.println("invalid amount");
	}
	public static void getbalance()
	{
	 System.out.println("your balance is"+balance);	
	}

}