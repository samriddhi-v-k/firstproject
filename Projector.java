class Projector
{
	static boolean isAssociated=false;
	static int currentVolume=6;
	static int minVolume;
	static int maxVolume=50;
	public static boolean switching()
	{
		if(isAssociated==false)
			isAssociated=true;
		else if(isAssociated==true)
			isAssociated=false;
		return isAssociated;
		
	}
	public static int increaseVolume()
	{
		if(isAssociated==true)
		{
			if(currentVolume<maxVolume)     
			{
				System.out.println("to increase the volume in projector");
				currentVolume=currentVolume+1;
				System.out.println("now the current volume is   "+currentVolume);
				return currentVolume;
			}
			else
				System.out.println("max volume has execced");
		}
		else
			System.out.println("the projector is not connected");
		return currentVolume;
	}
	public static int decreaseVolume()
	{
		if(isAssociated==true)
		{
			if(currentVolume>minVolume)
			{
				System.out.println("to decrease volume in projector ");
				currentVolume=currentVolume-1;
				System.out.println("now the current volume is "+currentVolume);
				return currentVolume;
			}
			else
				System.out.println("the min volume has execced");
		
		}
		else
			System.out.println("the projector is not connected,so the volume cannot be decreased");
		return currentVolume;
		
	}

	
	
	
}