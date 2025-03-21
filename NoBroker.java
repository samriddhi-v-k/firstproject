class NoBroker
{
public static String signUp(String phoneNo,String otp,String name,String emailId,String preferences,String budget)
{
	String property = null;
	boolean validUser = checkingData( phoneNo, otp, name, emailId, preferences, budget);
	if (validUser==true)
		property="user sign in successfull";
	else
		property="something went wrong try again";
	return property;
}
public static boolean checkingData(String phoneNo,String otp,String name,String emailId,String preferences,String budget)
{
	boolean userId=false;
		boolean isphoneNo=false;
		boolean isotp=false;
		boolean isname=false;
		boolean isemailId=false;
		boolean ispreferences=false;
		boolean isbudget=false; 
		if(phoneNo!=null && phoneNo.length()>0 && phoneNo.length()>=8&&!phoneNo.isEmpty())
			isphoneNo=true;
		else
			System.out.println("invalid phoneNo");
		if(otp!=null &&otp.length()>0 &&otp.length()>=4&&!otp.isEmpty())
			isotp=true;	
		else
			System.out.println("invalid otp");
		if(name!=null && name.length()>0 &&name.length()>=4&&!name.isEmpty())
			isname=true;
		else
			System.out.println("invalid Name");
		if(emailId!=null &&emailId.length()>0 &&emailId.length()>=5&&!emailId.isEmpty())
			isemailId=true;
		else
			System.out.println("invalid emailId");
		if(preferences!=null &&preferences.length()>0 &&preferences.length()>=5&&!preferences.isEmpty())
			ispreferences=true;
		else
			System.out.println("invalid preferences");
		if(budget!=null && budget.length()>0 && budget.length()>=3&&!budget.isEmpty())
			isbudget=true;
		else
			System.out.println("invalid buddget");
		
		
	if(isphoneNo==true && isotp==true && isname==true && isemailId==true && ispreferences==true && isbudget==true )
		userId=true;	
	return userId;		
}



}