class TubeLight 
{
	String powerRating;
	String lifeHours;
	String voltageRequired;
	
	
	TubeLight()
	{
		System.out.println("default constructor is used");
	}
	TubeLight(String powerRating,String lifeHours,String voltageRequired)
	{
		this.powerRating=powerRating;
		this.lifeHours=lifeHours;
		this.voltageRequired=voltageRequired;
	}



}