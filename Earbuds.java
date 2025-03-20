class Earbuds
{
static String brand ="amazon basics";
static	String colour = "Purple";
static	String earPlacement ="In Ear";
static	String formFactor = "In Ear";
static	String impedance = "32 Ohm";
public static void main(String ear[])
	{
		System.out.println("the brand is"+brand);
		System.out.println("the colour is"+colour);
		System.out.println("the earPlacement is"+earPlacement);
		System.out.println("the formFactor is"+formFactor);
		System.out.println("the impedance is"+impedance);
		brand =" basics";
		colour = "blue";
		earPlacement ="over Ear";
		formFactor = "over Ear";
		impedance = "50 Ohm";
		Earbuds.update();
		System.out.println("the brand is"+brand);
		System.out.println("the colour is"+colour);
		System.out.println("the earPlacement is"+earPlacement);
		System.out.println("the formFactor is"+formFactor);
		System.out.println("the impedance is"+impedance);
	
	}
	public static void update()
	{
		brand =" basics";
		colour = "blue";
		earPlacement ="over Ear";
		formFactor = "over Ear";
		impedance = "50 Ohm";
	}
}