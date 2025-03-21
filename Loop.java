class Loop
{
static int pinCodes[]={12,13,14,15};
	public static void main(String pin[])
		{
			System.out.println("the beginning of the main program ");
			getPinCodes();//for our own method invokation
			System.out.println("the end of the main program");
		}
	public static void getPinCodes()//get,fetch,read
		{
			System.out.println("inside our on class pinCodes()");
			System.out.println("pin code");
			for(int x :pinCodes){
				System.out.println(x);
			}
			System.out.println("outside the pinCodes()");
		}
		


}

