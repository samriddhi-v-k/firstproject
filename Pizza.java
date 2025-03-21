class Pizza
{
static int orderNo = 1234;
static	String name = "italian";
static	String size = "medium";
static	String type = "veg";
static	String extra = "cheese";
static	int price = 150;
public static void main(String pizza[])
	{
	
		System.out.println("the orderNo of the pizza is" +orderNo);
		System.out.println("the name of the pizza is" +name);
		System.out.println("the size of the pizza is" +size);
		System.out.println("the type of the pizza is" +type);
		System.out.println("the extra needed for the pizza is" +extra);
		orderNo = 4321;
		name = "mexican";
		size = "large";
		type = "non- veg";
		extra = "topicangs";
		price = 250;
		Pizza.update();
		System.out.println("the orderNo of the pizza is" +orderNo);
		System.out.println("the name of the pizza is" +name);
		System.out.println("the size of the pizza is" +size);
		System.out.println("the type of the pizza is" +type);
		System.out.println("the extra needed for the pizza is" +extra);
	
	}
	public static void update()
	{
		orderNo = 4321;
		name = "mexican";
		size = "large";
		type = "non- veg";
		extra = "topicangs";
		price = 250;
	}
}
	