class Resort
{
public static String signUp(String phoneNo,String otp,String name,String emailId,String governmentId,String typeOfMembership,int noOfFamilyMembers)
{
	String card = null;
	boolean validUser = checkingData( phoneNo,otp,name,emailId,governmentId,typeOfMembership,noOfFamilyMembers);
	if (validUser==true)
		card="user sign in successfull";
	else
		card="something went wrong try again";
	return card;
}
public static boolean checkingData(String phoneNo,String otp,String name,String emailId,String governmentId,String typeOfMembership,int noOfFamilyMembers)
{
	boolean userId=false;
		boolean isphoneNo=false;
		boolean isotp=false;
		boolean isname=false;
		boolean isemailId=false;
		boolean isgovernmentId=false;
		boolean istypeOfMembership=false;
		boolean isnoOfFamilyMembers=false;
		if(phoneNo!=null && phoneNo.length()>0 && phoneNo.length()>=8 &&!phoneNo.isEmpty())
			isphoneNo=true;
		else
			System.out.println("invalid phoneNo");
		if(otp!=null &&otp.length()>0 &&otp.length()>=4&& !otp.isEmpty())
			isotp=true;
		else
			System.out.println("invalid otp");
		if(name!=null && name.length()>0 &&name.length()>=4&&!name.isEmpty())
			isname=true;
		else
			System.out.println("invalid Name");
		if(emailId!=null &&emailId.length()>0 &&emailId.length()>=5&&!emailId.isEmpty())
			isemailId=true;
		if((governmentId=="aadhar"||governmentId=="pan card"||governmentId=="passport")&&!governmentId.isEmpty())
			isgovernmentId=true;
		else
			System.out.println("invalid id");
		if(!typeOfMembership.isEmpty()&&(typeOfMembership=="annual"||typeOfMembership=="monthly"||typeOfMembership=="lifetime"))
			istypeOfMembership=true;
			
		else
			System.out.println("invalid typeOfMembership");
		if(noOfFamilyMembers>=2)
			isnoOfFamilyMembers=true;
		else
			System.out.println("invalid noOfFamilyMembers");
		
		
		
	if(isphoneNo==true&&isotp==true&&isname==true&&isemailId==true&&isgovernmentId==true&&istypeOfMembership==true&&isnoOfFamilyMembers==true)
		userId=true;	
	return userId;
		
		
		
		
		
		
}



}