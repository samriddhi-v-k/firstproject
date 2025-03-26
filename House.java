class House
{
	String houseName;
    String address;
    int numberOfRooms;
    String ownerName;
	String houseType;
	int numberOfFloors;
	House()
	{
		System.out.println("the default constructor is invoked");
	}

	House(String houseName,String address,int numberOfRooms,String ownerName,String houseType,int numberOfFloors)
	{
		this.houseName=houseName;
		this.address=address;
		this.numberOfRooms=numberOfRooms;
		this.ownerName=ownerName;
		this.houseType=houseType;
		this.numberOfFloors=numberOfFloors;
	
	}
	public void own()
	{
		System.out.println("the housename is "+houseName);
		System.out.println("the address of the house is "+address);
		System.out.println("the numberOfRooms is "+numberOfRooms);
		System.out.println("the ownerName is "+ownerName);
		System.out.println("the houseType is "+houseType);
		System.out.println("th enumber of floors are "+numberOfFloors);
	}

}