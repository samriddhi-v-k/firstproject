class Kurta 
{
static  String material = "Silk Blend";
static  String size = "Medium";
static  String color = "Royal Blue";
static  String brand; 
static  String pattern = "Embroidered";
static  String sleeveType = "Full Sleeves";	
static  String occasion = "Wedding & Festive Wear";
        
	
    public static void main(String kurtha[]) 
	{
         
        System.out.println("The brand of the kurta is " + brand);//def null
        System.out.println("The material of the kurta is " + material);
        System.out.println("The size of the kurta is " + size);
        System.out.println("The color of the kurta is " + color);
        System.out.println("The pattern of the kurta is " + pattern);
        System.out.println("The sleeve type is " + sleeveType);
        System.out.println("Suitable for: " + occasion);
        System.out.println("The length of the kurta is " + length);//def 0
		material = "Silk Blend";
        size = "Medium";
        color = "Royal Blue";
		brand; 
        pattern = "Embroidered";
        sleeveType = "Full Sleeves";	
        occasion = "Wedding & Festive Wear";
		Kurta.update();
		System.out.println("The brand of the kurta is " + brand);//def null
        System.out.println("The material of the kurta is " + material);
        System.out.println("The size of the kurta is " + size);
        System.out.println("The color of the kurta is " + color);
        System.out.println("The pattern of the kurta is " + pattern);
        System.out.println("The sleeve type is " + sleeveType);
        System.out.println("Suitable for: " + occasion);
        System.out.println("The length of the kurta is " + length)
    }
	public static void update(){
		material = "Silk Blend";
         size = "Medium";
         color = "Royal Blue";
		  brand; 
         pattern = "Embroidered";
         sleeveType = "Full Sleeves";	
         occasion = "Wedding & Festive Wear";
	}
}
///any variable inside a constructor or meethod is local variable
///no global variable,oracle doc