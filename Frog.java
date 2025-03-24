class Frog
{
public static void secondaryConsumer()
	{
		System.out.println("the begining of the secondaryConsumer");
		Grasshopper.primaryConsumer();
		System.out.println("the end of the  secondaryConsumer");
	}

}