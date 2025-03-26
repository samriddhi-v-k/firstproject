class Wire
{
	String material;
	String thickness;
	String insulation;
	String maxCurrent;
	String voltageRating;
	String length;
	
	Wire()
	{
		System.out.println("the beginning of the constructor");
	}


	Wire(String material,String thickness,String insulation,String maxCurrent,String voltageRating,String length)
	{
		this.material=material;
		this.thickness=thickness;
		this.insulation=insulation;
		this.maxCurrent=maxCurrent;
		this.voltageRating=voltageRating;
		this.length=length;
	}
	public void bundle()
	{
		System.out.println("the material is "+material);
		System.out.println("the thickness is "+thickness);
		System.out.println("the insulation used is "+insulation);
		System.out.println("the maximim current flowing is "+maxCurrent);
		System.out.println("the voltageRating is "+voltageRating);
		System.out.println("the length of the wire is "+length);
	}


}