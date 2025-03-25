class Boat
{
public static String signUp(String phoneNo,String otp,String name,String emailId,String  bluetooth,String location,String modelNumber)
{
	String device = null;
	boolean validUser = checkingData( phoneNo, otp, name, emailId, bluetooth,location,modelNumber);
	if (validUser==true)
		device="user sign in successfull";
	else
		device="something went wrong try again";
	return device;

}
public static boolean checkingData(String phoneNo,String otp,String name,String emailId,String  bluetooth,String location,String modelNumber)
{
	boolean userId=false;
		boolean isphoneNo=false;
		boolean isotp=false;
		boolean isname=false;
		boolean isemailId=false;
		boolean isbluetooth=false;
		boolean islocation=false;
		boolean ismodelNumber=false;
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
		if((bluetooth=="on" || bluetooth=="off")&&!bluetooth.isEmpty())
			isbluetooth=true;
		else
			System.out.println("invalid command");
		if(location!=null &&location.length()>0 &&location.length()>=4&&!location.isEmpty())
			islocation=true;
		else
			System.out.println("invalid location");
		if(modelNumber!=null &&modelNumber.length()>0 &&modelNumber.length()>=4&&!modelNumber.isEmpty())
			ismodelNumber=true;
		else
			System.out.println("invalid modelNumber");
			
		
	if(isphoneNo==true&&isotp==true&&isname==true&&isemailId==true&&isbluetooth==true&& islocation==true&&ismodelNumber==true)
		userId=true;	
	return userId;		
		
		
		
		
		
}



}




