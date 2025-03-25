class CarryBag
{
	String capacity;
	String width;
	String height;
	
	CarryBag()
	{
		System.out.println("the default constructor is generated");
	}


	CarryBag(String capacity,String width,String height)
	{
		this.capacity=capacity;
		this.width=width;
		this.height=height;
		
	}
	
	public void instructionsOfCarryBag()
	{
		System.out.println("the capacity of the carrybag is "+capacity);
		System.out.println("the width is "+this.width);
		System.out.println("the height is "+this.height);
		System.out.println("");
	}


}