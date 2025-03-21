class Watch
{
static String caseDiameter = "38 Millimetres";
static	String bandColour = "Two Tone";
static	String bandMaterial = "Stainless Steel";
static	String warranty  = "Manufacturer";
static	String watchMovement = "Quartz";
static	int itemWeight = 50;
public static void main(String watch[])
	{
	 
	 
	System.out.println("the caseDiameter of the watch is" +caseDiameter);
	System.out.println("the bandColour of the watch is" +bandColour);
	System.out.println("the bandMaterial of the watch is" +bandMaterial);
	System.out.println("the warranty  of the watch is" +warranty);
	System.out.println("the watchMovement is" +watchMovement);
	System.out.println("the weight of the watch is" +itemWeight);
	Watch.update();
	System.out.println("the caseDiameter of the watch is" +caseDiameter);
	System.out.println("the bandColour of the watch is" +bandColour);
	System.out.println("the bandMaterial of the watch is" +bandMaterial);
	System.out.println("the warranty  of the watch is" +warranty);
	System.out.println("the watchMovement is" +watchMovement);
	System.out.println("the weight of the watch is" +itemWeight);
	}
	 public static void update()
	 {
	caseDiameter = "39 Millimetres";
	 bandColour = "Three Tone";
	 bandMaterial = " Steel";
	warranty  = "Manufacturer";
	watchMovement = "Quartz";
	 itemWeight = 60;
	 }
}	
	