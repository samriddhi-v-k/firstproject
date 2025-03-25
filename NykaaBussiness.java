class NykaaBussiness
{
public static String signUp(String bussinessName,String contactInformation,String bussinessAddress,String productCategories,String gstCertificate,String panCard)
{
 ///selling bussiness products on nykaa
	String ref = null;
	boolean validUser = checkingData(bussinessName,contactInformation,bussinessAddress,productCategories,gstCertificate,panCard);
	if (validUser==true)
		ref="user sign in successfull";
	else
		ref="something went wrong try again";
	return ref;
}
public static boolean checkingData(String bussinessName,String contactInformation,String bussinessAddress,String productCategories,String gstCertificate,String panCard)
{
	boolean userId=false;
		boolean isbussinessName=false;
		boolean iscontactInformation = false;
		boolean isbussinessAddress = false;
		boolean isproductCategories = false;
		boolean isgstCertificate = false;
		boolean ispanCard = false;
		if (bussinessName!=null && bussinessName.length()>0 && bussinessName.length()>=7&&!bussinessName.isEmpty())
			isbussinessName=true;
		else
			System.out.println("invalid bussinessName");
		if(contactInformation!=null && contactInformation.length()>0 &&contactInformation.length()>=5 &&!contactInformation.isEmpty())
			iscontactInformation=true;
		else
			System.out.println("invalid contactInformation");
		if(bussinessAddress!=null && bussinessAddress.length()>0&& bussinessAddress.length()>=6&&!bussinessAddress.isEmpty())
			isbussinessAddress=true;
		else
			System.out.println("invalid bussinessAddress");
		if(productCategories!=null && productCategories.length()>0 &&productCategories.length()>=9&&!productCategories.isEmpty())
			isproductCategories=true;
		else
			System.out.println("invalid invalid productCategories");
		if(gstCertificate!=null && gstCertificate.length()>=11&&gstCertificate.isEmpty())
			isgstCertificate=true;
		else
			System.out.println("invalid gstCertificate");
		if(panCard!=null && panCard.length()>0 && panCard.length()>11&&!panCard.isEmpty())
			ispanCard=true;
		else
			System.out.println("invalid pancard no");
	if(isbussinessName==true &&iscontactInformation==true &&isbussinessAddress ==true &&isproductCategories==true && isgstCertificate ==true && ispanCard ==true )
		userId=true;
	return userId;
			
}

}