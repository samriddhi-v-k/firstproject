class PinCode
{

	public static void main(String pin[])
		{
	System.out.println("the begining of the main program");
	int pinCodes[] = {560026,560093,560025,560064,560049,560083,560004,560092,560078,560073};
	int pin1 = pinCodes[0];
	System.out.println(pin1);
	System.out.println("the total no of pin codes are given as  "+pinCodes.length);
	System.out.println("the list of area pin code are displayed below :");
	System.out.println(pinCodes[0]+" "+pinCodes[1]+" "+pinCodes[2]+" "+pinCodes[3]+" "+pinCodes[4]+" "+
	pinCodes[5]+" "+pinCodes[6]+" "+pinCodes[7]+" "+pinCodes[8]+" "+pinCodes[9]);
	System.out.println("by using loops you can print as");
	
	for(int x :pinCodes){ ////it replaces the traditional style of for loop
		System.out.println(x);
	}
	System.out.println("the end of the main program");
	}
//<access-specifier> returnType methodName(Parameter){
	public static void fetchPinCodes()//get,fetch,read
		{
	
		}


}
