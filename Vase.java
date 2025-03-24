class Vase 
{
    String basewidth;
    String cost;
    String pattern;
	Vase
	{
		System.out.println("the deafault constructor is invoked");
	}

    Vase(String baseWidth,String cost,String pattern) 
	{
		this.basewidth=basewidth;
		this.cost=cost;
		this.pattern=pattern;
        
    }
}
