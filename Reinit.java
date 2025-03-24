class Reinit
{
static String sam = "sapthagiri college of engineering";
	public static void main(String re[])
	{
		System.out.println("starting of the main program");
		System.out.println("initial declaration "+sam);
		sam = "sapthagiri university";
		System.out.println("after reinitilaisation "+sam);
		Reinit.hello();
		System.out.println("end of the program");
		
	}
	public static void hello()
	{
		sam = "sapthagiri university";
		System.out.println("other way  "+sam );
	}


}