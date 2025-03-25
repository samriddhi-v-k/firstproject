class AirConditioner
{
static boolean ispaired=false;
static int roomtemp=3;
static int minTemp;
static int maxtemp=10;
	public static boolean turning()
	{
		if(ispaired==false)
			ispaired=true;
		else if(ispaired==true)
			ispaired=false;
		return ispaired;
	}
	public static int increaseTemperature()
	{
		if(ispaired==true)
		{
			if(roomtemp<maxtemp)     
			{
				System.out.println("to increase the temp in ac");
				roomtemp=roomtemp+1;
				System.out.println("now the current temp is   "+roomtemp);
				return roomtemp;
			}
			else
				System.out.println("max temp has execced");
		}
		else
			System.out.println("the ac is not connected");
		return roomtemp;
		
	}
	public static int decreaseTemperature()
	{
		if(ispaired==true)
		{
			if(roomtemp>minTemp)
			{
				System.out.println("to decrease Temperature in ac ");
				roomtemp=roomtemp-1;
				System.out.println("now the current temp is "+roomtemp);
				return roomtemp;
			}
			else
				System.out.println("the min temp has execced");
		
		}
		else
			System.out.println("the ac is not connected,so the temp cannot be decreased");
		return roomtemp;
		
	}


}