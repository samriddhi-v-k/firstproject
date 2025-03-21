class Fridge
{
static boolean isPlugged=false;
static int currentCooling=6;
static int minCooling;
static int maxCooling=20;
	public static boolean supply()
	{
		if(isPlugged==false)
			isPlugged=true;
		else if(isPlugged==true)
			isPlugged=false;
		return isPlugged;
	}
	public static int increaseCooling()
	{
		if(isPlugged==true)
		{
			if(currentCooling<maxCooling)     
			{
				System.out.println("to increase the cooling in fridge");
				currentCooling=currentCooling+1;
				System.out.println("now the current cooling is   "+currentCooling);
				return currentCooling;
			}
			else
				System.out.println("max cooling has execced");
		}
		else
			System.out.println("the fridge is not connected");
		return currentCooling;
		
	}
	public static int decreaseCooling()
	{
		if(isPlugged==true)
		{
			if(currentCooling>minCooling)
			{
				System.out.println("to decrease cooling in fridge ");
				currentCooling=currentCooling-1;
				System.out.println("now the current temp is "+currentCooling);
				return currentCooling;
			}
			else
				System.out.println("the min cooling has execced");
		
		}
		else
			System.out.println("the fridge is not connected,so the cooling cannot be decreased");
		return currentCooling;
		
	}


}