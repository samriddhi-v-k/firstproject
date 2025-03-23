class ColdDrink
{
	String calories;
	String fizzlevel;
	String packagingType;
	
	ColdDrink()
	{
		System.out.println("the default constructor for cold drink is generated");
	}

	
	ColdDrink(String calories,String fizzlevel,String packagingType)
	{
		this.calories=calories;
		this.fizzlevel=fizzlevel;
		this.packagingType=packagingType;
	}


}