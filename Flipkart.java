class Flipkart
{
public static String signUp(String phoneNo,String otp,String name,String emailId,String deliveryAddress,String paymentMethod)
{
	String order = null;
	boolean validUser = checkingData(phoneNo, otp, name, emailId, deliveryAddress,paymentMethod);
	if (validUser==true)
		order="user sign in successfull";
	else
		order="something went wrong try again";
	return order;
}
public static boolean checkingData(String phoneNo,String otp,String name,String emailId,String deliveryAddress,String paymentMethod)
{
	boolean userId=false;
		boolean isphoneNo=false;
		boolean isotp=false;
		boolean isname=false;
		boolean isemailId=false;
		boolean isdeliveryAddress=false;
		boolean ispaymentMethod=false;
		if(phoneNo!=null && phoneNo.length()>0 && phoneNo.length()>=8)
			isphoneNo=true;
		else
			System.out.println("invalid phoneNo");
		if(otp!=null &&otp.length()>0 &&otp.length()>=4)
			isotp=true;
		else
			System.out.println("invalid otp");
		if(name!=null && name.length()>0 &&name.length()>=4)
			isname=true;
		else
			System.out.println("invalid Name");
		if(emailId!=null &&emailId.length()>0 &&emailId.length()>=5)
			isemailId=true;
		else
			System.out.println("invalid emailId");
		if(deliveryAddress!=null &&deliveryAddress.length()>0 &&deliveryAddress.length()>=6)
			isdeliveryAddress=true;
		else
			System.out.println("invalid emailId");
		if(paymentMethod!=null && paymentMethod.length()>0 && paymentMethod.length()>=3)
			ispaymentMethod=true;
		else
			System.out.println("invalid emailId");
		
		
	if(isphoneNo==true && isotp==true && isname==true &&isemailId==true && isdeliveryAddress==true &&ispaymentMethod==true  )
		userId=true;
	
	return userId;
		
		
		
		
		
		
}



}