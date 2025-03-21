class Iron
{
static boolean isHeated=false;
static int roomtemp=3;
static int minTemp;
static int maxtemp=10;
	public static boolean turning()
	{
		if(isHeated==false)
			isHeated=true;
		else if(isHeated==true)
			isHeated=false;
		return isHeated;
	}
	public static int increaseTemperature()
	{
		if(isHeated==true)
		{
			if(roomtemp<maxtemp)     
			{
				System.out.println("to increase the temp in iron");
				roomtemp=roomtemp+1;
				System.out.println("now the current temp is   "+roomtemp);
				return roomtemp;
			}
			else
				System.out.println("max temp has execced");
		}
		else
			System.out.println("the iron is not connected");
		return roomtemp;
		
	}
	public static int decreaseTemperature()
	{
		if(isHeated==true)
		{
			if(roomtemp>minTemp)
			{
				System.out.println("to decrease Temperature in iron ");
				roomtemp=roomtemp-1;
				System.out.println("now the current temp is "+roomtemp);
				return roomtemp;
			}
			else
				System.out.println("the min temp has execced");
		
		}
		else
			System.out.println("the iron is not connected,so the temp cannot be decreased");
		return roomtemp;
		
	}


}