class Perfumes
{
static String brand = "Bella Vita Luxury";
static	String itemForm	= "Liquid";
static	String itemVolume =	"80 Millilitres";
static	String scent =	"Wood";
static	String specialFeature = "not tested on animals";
public static void main(String perfumes[])
	{
		System.out.println("the brand of the perfume is "+ brand);
		System.out.println("the item form is "+itemForm);
		System.out.println("the volume is "+itemVolume);
		System.out.println("the scent of the perfume is" +scent);
		System.out.println("the speecial feature of the bag is" +specialFeature);
		brand = " Luxury";
		itemForm	= "Liquid";
		itemVolume =	"85 Millilitres";
		scent =	"taek";
		Perfumes.update();
		specialFeature = "not tested on animals/delicate skin";
		System.out.println("the brand of the perfume is "+ brand);
		System.out.println("the item form is "+itemForm);
		System.out.println("the volume is "+itemVolume);
		System.out.println("the scent of the perfume is" +scent);
		System.out.println("the speecial feature of the bag is" +specialFeature);
	
	}
	public static void update()
	{
	 brand = "Luxury";
	 itemForm	= "Liquid";
	 itemVolume =	"85 Millilitres";
	 scent =	"taek";
	 specialFeature = "not tested on animals/delicate skin";
	}

}