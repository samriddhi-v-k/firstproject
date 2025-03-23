class Shampoo
{
	String quantity;
	String typeOfShampoo;
	String suitableHairType;
	
	Shampoo()
	{
		System.out.println("the default shampoo constructor is provoked");
	}

	Shampoo(String quantity,String typeOfShampoo,String suitableHairType)
	{
			this.quantity=quantity;
			this.typeOfShampoo=typeOfShampoo;
			this.suitableHairType=suitableHairType;
	}

}