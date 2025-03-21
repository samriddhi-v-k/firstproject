class Travelbag
{
static    String date =  "18 November 2020";
static     String manufacturer  =  "Bag zone Lifestyle Pvt Ltd";
static     String asin =  "B08NVFGMMN";
static     String itemModelNumber =  "DGGE530040M2";
static     String countryOfOrigin = "India";
public static void main(String travelbag[])
	{
	
	System.out.println("the dateFirstAvailable is" +date);
	System.out.println("the manufacturer is  " +manufacturer);
	System.out.println("the asin of the travel bag is"+asin);
	System.out.println("the itemModelNumber is" +itemModelNumber);
	System.out.println("the origin is" +countryOfOrigin);
	Travelbag.update();
	System.out.println("the dateFirstAvailable is" +date);
	System.out.println("the manufacturer is  " +manufacturer);
	System.out.println("the asin of the travel bag is"+asin);
	System.out.println("the itemModelNumber is" +itemModelNumber);
	System.out.println("the origin is" +countryOfOrigin);
	
	}
	public static void upate();
	{
	 date =  "19 November 2020";
     manufacturer  =  "Bag zone Lifestyle Pvt Ltd";
     asin =  "A08NVFGMMN";
     itemModelNumber =  "DGGE530040M2";
     countryOfOrigin = "japan";
	}
}