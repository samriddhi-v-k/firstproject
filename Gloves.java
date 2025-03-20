class Gloves
{
static  String brand =	"Steelbird";
static	String material ="Polyester";
static	String size	= "XL";
static	String sport = "Motorcycle Racing";
static	String gloveType = "Motocross";
public static void main(String gloves[])
	{
		System.out.println("the brand is "+brand);
		System.out.println("the material is"+material);
		System.out.println("the size is"+size);
		System.out.println("the sport type is "+sport);
		System.out.println("the glove type is"+gloveType);
		brand =	"bird";
		material ="cotton";
		size	= "L";
		sport = " Racing";
		gloveType = "cross";
		Gloves.update();
		System.out.println("the brand is "+brand);
		System.out.println("the material is"+material);
		System.out.println("the size is"+size);
		System.out.println("the sport type is "+sport);
		System.out.println("the glove type is"+gloveType);
	}
	public static void update(){
		brand =	"bird";
		material ="cotton";
		size	= "L";
		sport = " Racing";
		gloveType = "cross";
	}
}