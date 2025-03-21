class Mouse
{
static String brand = "Razer";
static	String colour = "Black";
static	String connectivityTechnology = "Bluetooth";
static String specialFeature = "	Wireless, Ergonomic Design";
	public static void main(String mouse[])
	{
		System.out.println("the brand is "+brand);
		System.out.println("the colour is "+colour);
		System.out.println("the connectivityTechnology is "+connectivityTechnology);
		System.out.println("the specialFeature is "+specialFeature);
		brand = "blazer";
		colour = "Blue";
		connectivityTechnology = "wireless Bluetooth";
		specialFeature = "	 Ergonomic Design";
		Mouse.update();
		System.out.println("the brand is "+brand);
		System.out.println("the colour is "+colour);
		System.out.println("the connectivityTechnology is "+connectivityTechnology);
		System.out.println("the specialFeature is "+specialFeature);
	
	}
	public static void update()
	{
		brand = "blazer";
		colour = "Blue";
		connectivityTechnology = "wireless Bluetooth";
		specialFeature = "	 Ergonomic Design";
	}
}