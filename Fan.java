class Fan
{
static boolean isTunned=false;
static int currentSpeed=3;
static int minSpeed;
static int maxSpeed=5;
	public static boolean rotating()
	{
		if(isTunned==false)
			isTunned=true;
		else if(isTunned==true)
			isTunned=false;
		return isTunned;
	}
	public static int increaseSpeed()
	{
		if(isTunned==true)
		{
			if(currentSpeed<maxSpeed)     
			{
				System.out.println("to increase the Speed in fan");
				currentSpeed=currentSpeed+1;
				System.out.println("now the current speed is   "+currentSpeed);
				return currentSpeed;
			}
			else
				System.out.println("max speed has execced");
		}
		else
			System.out.println("the fan is not connected");
		return currentSpeed;
		
	}
	public static int decreaseSpeed()
	{
		if(isTunned==true)
		{
			if(currentSpeed>minSpeed)
			{
				System.out.println("to decrease speed in fan ");
				currentSpeed=currentSpeed-1;
				System.out.println("now the current speed is "+currentSpeed);
				return currentSpeed;
			}
			else
				System.out.println("the min speed has execced");
		
		}
		else
			System.out.println("the fan is not connected,so the speed cannot be decreased");
		return currentSpeed;
		
	}


}