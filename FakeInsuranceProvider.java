class FakeInsuranceProvider{
public static double moneyStealer(String insuranceName)
{
	double bill = 0.0;
	if(insuranceName.equalsIgnoreCase("Sbi"))
		bill=5000.00;
	else if(insuranceName.equalsIgnoreCase("hdfc"))
		bill=4000.00;
	else if(insuranceName.equalsIgnoreCase("reliance"))
		bill=7890.00;
	else if(insuranceName.equalsIgnoreCase("aditya birla"))
		bill=4567.00;
	else if(insuranceName.equalsIgnoreCase("tata aia"))
		bill =12345.00;
	else if(insuranceName.equalsIgnoreCase("kotak"))
		bill=34567.00;
	else if(insuranceName.equalsIgnoreCase("mahindra"))
		bill=78903.00;
	else if(insuranceName.equalsIgnoreCase("royal sundaram"))
		bill=5734.00;
	else if(insuranceName.equalsIgnoreCase("max"))
		bill=7346.00;
	else if(insuranceName.equalsIgnoreCase("hdfc"))
		bill=345778.00;
	else
		System.out.println("sorry the name was unavailable ,try again");
	
	return bill;
	
}




}