class MyGlamm
{
public static String signUp(String name,String phoneNo,String emailId,String password,String confirmPassword,String dob,String referralCode )
{
	String product = null;
	boolean validUser = checkingData(name,phoneNo,emailId,password,confirmPassword,dob,referralCode);
	if (validUser==true)
		product="user sign in successfull";
	else
		product="something went wrong try again";
	return product;
}
public static boolean checkingData(String name,String phoneNo,String emailId,String password,String confirmPassword,String dob,String referralCode)
{
	boolean userdata=false;
		boolean isname=false;
		boolean isphoneNo=false;
		boolean isemailId = false;
		boolean ispassword=false;
		boolean isconfirmPassword = false;
		boolean isdob=false;
		boolean isreferralCode=false;
		if(name!=null && name.length()>=5&&!name.isEmpty())
			isname=true;
		else
			System.out.println("invalid username");
		if(phoneNo!=null && phoneNo.length()>0&& phoneNo.length()>=10&&!phoneNo.isEmpty())
			isphoneNo=true;
		else
			System.out.println("invalid phoneNo");
		if(emailId!=null && emailId.length()>0 &&emailId.length()>=5&&!emailId.isEmpty())
			isemailId=true;
		else
			System.out.println("invalid emailId");
		if(password!=null && password.length()>=7&& !password.isEmpty())
			ispassword=true;
		else
			System.out.println("incorrect password");
		if(confirmPassword.length()==password.length())
		
			isconfirmPassword=true;
			
		else
			System.out.println("password entered is wrong");
		if(dob!=null && dob.length()>0 && dob.length()>=9&&!dob.isEmpty())
			isdob=true;
		else
			System.out.println("incorrect dob");
		if(referralCode!=null && referralCode.length()>=3&&!referralCode.isEmpty())
			isreferralCode=true;
		else
			System.out.println("inalid referralCode");
	if( isname==true&& isphoneNo==true && isemailId==true &&ispassword==true && isconfirmPassword==true && isdob==true && isreferralCode==true)
		userdata=true;
	return userdata;
	
}
}





