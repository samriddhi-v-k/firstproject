class Microwave
{
static boolean isOn=false;
static int presentTemp=30;
static int minTemp;
static int maxtemp=100;
	public static boolean power()
	{
		if(isOn==false)
			isOn=true;
		else if(isOn==true)
			isOn=false;
		return isOn;
	}
	public static int increaseTemperature()
	{
		if(isOn==true)
		{
			if(presentTemp<maxtemp)     
			{
				System.out.println("to increase the temp in microwave");
				roomtemp=roomtemp+1;
				System.out.println("now the current temp is  "+presentTemp);
				return presentTemp;
			}
			else
				System.out.println("max temp has execced");
		}
		else
			System.out.println("the microwave is not connected");
		return presentTemp;
		
	}
	public static int decreaseTemperature()
	{
		if(isOn==true)
		{
			if(presentTemp>minTemp)
			{
				System.out.println("to decrease Temperature in ac ");
				presentTemp=presentTemp-1;
				System.out.println("now the current temp is "+presentTemp);
				return presentTemp;
			}
			else
				System.out.println("the min temp has execced");
		
		}
		else
			System.out.println("the microwave is not connected,so the temp cannot be decreased");
		return presentTemp;
		
	}


}