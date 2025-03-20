class Cabinet
{
static	String brand = "Space Galaxy";
static	String colour = "A-Natural Finish";
static	String material = "	Sheesham Wood";
static	String recommendedUses ="For Product Crockery";
static	String specialFeature = "Hinged Door";
	public static void main(String cabinet[])
	{
				
		System.out.println("the brand of the cabinet is "+brand);
		System.out.println("the colour of the cabinet is "+colour);
		System.out.println("the material of the cabinet is "+material);
		System.out.println("the recommendedUses are "+recommendedUses);
		System.out.println("the specialFeature is " +specialFeature);
		brand = "AMAZON	";
		colour = "rose gold";
		material = "sandal Wood";
		recommendedUses ="organising";
		specialFeature = "folded door";
		Cabinet.update();
		System.out.println("the brand of the cabinet is "+brand);
		System.out.println("the colour of the cabinet is "+colour);
		System.out.println("the material of the cabinet is "+material);
		System.out.println("the recommendedUses are "+recommendedUses);
		System.out.println("the specialFeature is " +specialFeature);
	}
	public static void update()
	{
		brand = "AMAZON	";
		colour = "rose gold";
		material = "sandal Wood";
		recommendedUses ="organising";
		specialFeature = "folded door";
	}
}	