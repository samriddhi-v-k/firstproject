class Bottle
{
static	String brand = "SKYTONE";
static	String material = "Silicone";
static	String bottleType = "Round";
static	String colour = "Multicolour";
static	String capacity	= "2 litres";
	public static void main(String bo[])
	{
	 
		System.out.println("the brand of the bottle is" +brand);
		System.out.println("the material of the bottle is" +material);
		System.out.println("the bottleType is" +bottleType);
		System.out.println("the colour is" +colour);
		System.out.println("the capacity of the bottle is "+capacity);
		brand = "MILTON";
		material = "plastic";
		bottleType = "square";
		colour = "white";
		capacity = "10 litres";
		Bottle.update();
		System.out.println("the brand of the bottle is" +brand);
		System.out.println("the material of the bottle is" +material);
		System.out.println("the bottleType is" +bottleType);
		System.out.println("the colour is" +colour);
		System.out.println("the capacity of the bottle is "+capacity);
	}
	public static void update()
	{
	 brand = "MILTON";
	 material = "plastic";
	 bottleType = "square";
	 colour = "white";
	 capacity	= "10 litres";
	}



}