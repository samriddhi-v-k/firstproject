class Airport
{
static	String boardingNo = "xxxxxxxx";
static  String terminal = "T3";
static  String type = "domestic";
static	String location = "bengaluru";
static	String planeName = "air india";
	public static void main(String  air[])
	{
	 
		System.out.println("the boardingNo of the ticket is "+boardingNo);
		System.out.println("the terminal of the plane is " +terminal);
		System.out.println("the type of the airport is" +type);
		System.out.println("the loaction of the airport is" +location);
		System.out.println("the planeName is " +planeName);
		boardingNo = "yyyyyy";
		terminal = "T2";
		type = "international";
		location = "delhi";
		planeName = "spicejet";
		Airport.update();
		System.out.println("the boardingNo of the ticket is "+boardingNo);
		System.out.println("the terminal of the plane is " +terminal);
		System.out.println("the type of the airport is" +type);
		System.out.println("the loaction of the airport is" +location);
		System.out.println("the planeName is " +planeName);
	}
	public static void update()
	{
	 boardingNo = "yyyyyy";
     terminal = "T2";
	 type = "international";
	 location = "delhi";
	 planeName = "spicejet";
	}


}