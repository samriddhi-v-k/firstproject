class FakeInsurance
{
	
public static String create(String insuranceName)
{
	String ref =null;
	boolean user =FakeInsurance.moneyStealer(insuranceName);
	if(user==true)
		ref="plan successful";
	else
		ref="plan unsuccessful";
	return ref;
	
}
public static double moneyStealer(String insuranceName)
{
	double bill = 0.0;
	if(insuranceName=="Sbi")
		bill=5000.00;
	if(insuranceName=="hdfc")
		bill=4000.00;
	if(insuranceName=="reliance")
		bill=7890.00;
	if(insuranceName=="aditya birla")
		bill=4567.00;
	if(insuranceName=="tata aia")
		bill =12345.00;
	if(insuranceName=="kotak")
		bill=34567.00;
	if(insuranceName=="mahindra")
		bill=78903.00;
	if(insuranceName=="royal sundaram")
		bill=365734.00;
	if(insuranceName=="max")
		bill=7346.00;
	if(insuranceName=="hdfc")
		bill=345778.00;
	else
		System.out.println("sorry the name was unavailable ,try again");
	return bill;
	
}



}