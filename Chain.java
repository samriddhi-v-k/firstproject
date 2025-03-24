class Chain 
{
    String design;
    String claspType;
    String purity;
	
	Chain()
	{
		System.out.println("the deafult constructor is generated");
	}

    Chain(String design, String claspType, String purity) 
	{
        this.design = design;
        this.claspType = claspType;
        this.purity = purity;
    }
}