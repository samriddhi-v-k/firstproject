class Realbook
{
	
public static String signUp(String firstName,String lastName,String phoneNo,String dob,String email,String gender)
{
	String account = null;
	
	boolean userIsValid=Realbook.validatingData( firstName, lastName, phoneNo, dob, email, gender);

	if (userIsValid == true)
		account = "user signup is successful";
	else 
		account = "user signup is unsuccessful";
	
	return account;
}

public static boolean validatingData(String  firstName,String lastName,String phoneNo,String dob ,String email,String gender)
	{
	  boolean userValid = false;
			boolean isfirstName = false;
			boolean islastName = false;
			boolean isphoneNo = false;
			boolean isdob = false;
			boolean isemail = false;
			boolean isgender = false;
		if(firstName!=null && firstName.length()>=2&&!firstName.isEmpty())
			isfirstName = true;
		else
			System.out.println("first name is invalid ,try again");
		if(lastName!=null && lastName.length()>=1&&!lastName.isEmpty())
			islastName = true;
		else
			System.out.println("last name is invalid,try again");
		if(phoneNo!=null&& phoneNo.length()>0 && phoneNo.length() == 10&&!phoneNo.isEmpty())
			isphoneNo= true;
		else
			System.out.println("invalid phone number,try again");
		if(dob!=null&&!dob.isEmpty())
			isdob = true;
		else
			System.out.println("invalid date of birth");
		if(email!=null&&!email.isEmpty())
			isemail = true;
		else
			System.out.println("invalid email");
		if(gender!=null&&!gender.isEmpty())
			isgender=true;
		else
			System.out.println("invalid input");

		if(isfirstName==true && islastName== true && isphoneNo== true && isdob == true && isemail== true && isgender==true )
			userValid =true;
	  return userValid;
	} 
}   




