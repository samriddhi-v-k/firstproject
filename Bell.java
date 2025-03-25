class Bell
{
	String diameter;
	String pitch;
	String weight;
	
	
	Bell()
	{
		System.out.println("the default constructor is invoked");

	}

	Bell(String diameter,String pitch,String weight)
	{
		this.diameter=diameter;
		this.pitch=pitch;
		this.weight=weight;
	}
	
	
	
	
	public void crossCheckBell()
	{
		System.out.println("the diameter "+this.diameter);
		System.out.println("the pitch is "+this.pitch);
		System.out.println("the weight is "+this.weight);
		System.out.println("");
	}

}