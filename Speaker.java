class Speaker
{
	static boolean islinked=false;
	static int currentVolume=6;
	static int minVolume;
	static int maxVolume=50;
	public static boolean sound()
	{
		if(islinked==false)
			islinked=true;
		else if(islinked==true)
			islinked=false;
		return islinked;
		
	}
	public static int increaseVolume()
	{
		if(islinked==true)
		{
			if(currentVolume<maxVolume)     
			{
				System.out.println("to increase the volume in speaker");
				currentVolume=currentVolume+1;
				System.out.println("now the current volume is   "+currentVolume);
				return currentVolume;
			}
			else
				System.out.println("max volume has execced");
		}
		else
			System.out.println("the speaker is not connected");
		return currentVolume;
	}
	public static int decreaseVolume()
	{
		if(islinked==true)
		{
			if(currentVolume>minVolume)
			{
				System.out.println("to decrease volume in speaker  ");
				currentVolume=currentVolume-1;
				System.out.println("now the current volume is "+currentVolume);
				return currentVolume;
			}
			else
				System.out.println("the min volume has execced");
		
		}
		else
			System.out.println("the speaker is not connected,so the volume cannot be decreased");
		return currentVolume;
		
	}
}