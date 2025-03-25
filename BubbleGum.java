class BubbleGum
{
	String mainIngriedient;
	String targetAge;
	String advantages;
	
	BubbleGum()
	{
		System.out.println("no arguements constructor of class bubblegum");
	}
	
	
	BubbleGum(String mainIngriedient,String targetAge,String advantages)
	{
		this.mainIngriedient= mainIngriedient;
		this.targetAge= targetAge;
		this.advantages= advantages;
	}
	
	public void updatingProfile()
	{
		System.out.println("the mainIngriedient is "+this.mainIngriedient);
		System.out.println("the targetAge is "+this.targetAge);
		System.out.println("the advantages are "+this.advantages);
		System.out.println("");
	}
	
	



}