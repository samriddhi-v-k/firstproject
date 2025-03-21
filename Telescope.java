class Telescope
{
static     String brand =  "amazon basics";
static	String modelName = "AB-TS90X";
static	String telescopeMountDescription = "Altazimuth Mount";
static	String focusType = "Manual Focus";	
public static void main(String or[])
	{
	 	
	System.out.println("the brand is "+brand);
	System.out.println("the modelName is"+modelName);
	System.out.println("the telescopeMountDescription is "+telescopeMountDescription);
	System.out.println("the focusType is"+focusType);
	Telescope.update();
	System.out.println("the brand is "+brand);
	System.out.println("the modelName is"+modelName);
	System.out.println("the telescopeMountDescription is "+telescopeMountDescription);
	System.out.println("the focusType is"+focusType);
	}
	public static void update()
	{
	brand =  " basics";
	 modelName = "TS90X";
	 telescopeMountDescription = " Mount";
	 focusType = " Focus";
	}
}