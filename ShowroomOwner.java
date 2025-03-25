class ShowroomOwner
{
	
	String name;
	String contact;
	long phoneNumber;
	String password;
	 
	ShowroomOwner()
	{	
		this("sam","samriddhivk@rediff");
		System.out.println("the constructor is invoked");
	}
	ShowroomOwner(String name,String contact)
	{
		this(1234567L);
		this.name=name;
		this.contact=contact;
		System.out.println("constructor with 2 Strings is invoked");
	}

	ShowroomOwner(long phoneNumber)
	{
		this("sam@123");
		this.phoneNumber=phoneNumber;
		System.out.println("constructor with 1 string parameter is invoked");
	}

	ShowroomOwner(String password)
	{
		this.password=password;
		System.out.println("end of the constructor");
	}
	
	
	public void checkingDetails()
	{
		System.out.println("the name is given as"+name);
	}



}