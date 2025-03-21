class KCBanking
{
public static void main(String bank[])
	{
		System.out.println("main started");
		KCBank.credit(700);
		System.out.println("now the available balance is");
		KCBank.getbalance();
		KCBank.debit(20);
		System.out.println("now the available balance after withdrawal is");
	    KCBank.getbalance();
		System.out.println("end of the main");
	
	}
}