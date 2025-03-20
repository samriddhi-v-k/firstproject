class DiningTable 
{
static String brand = "WoodCraft";
static String material = "Solid Oak Wood";
static String shape = "Rectangular";
static String seatingCapacity = "6 people";
static String color = "Dark Brown";
static String dimensions = "72 x 36 x 30 inches";
static String finish = "Polished";
    public static void main(String table[]) 
	{
        System.out.println("The brand of the dining table is " + brand);
        System.out.println("The material of the table is " + material);
        System.out.println("The shape of the table is " + shape);
        System.out.println("The seating capacity is " + seatingCapacity);
        System.out.println("The color of the table is " + color);
        System.out.println("The dimensions of the table are " + dimensions);
        System.out.println("The finish of the table is " + finish);
		brand = "amazon";
        material = " Oak Wood";
        shape = "square";
        seatingCapacity = "10 people";
        color = "white marble";
        dimensions = "60x 30 x 20 inches";
         finish = "non Polished";
		DiningTable.update();
		System.out.println("The brand of the dining table is " + brand);
        System.out.println("The material of the table is " + material);
        System.out.println("The shape of the table is " + shape);
        System.out.println("The seating capacity is " + seatingCapacity);
        System.out.println("The color of the table is " + color);
        System.out.println("The dimensions of the table are " + dimensions);
        System.out.println("The finish of the table is " + finish);
    }
	 public static void update()
	 {
		brand = "amazon";
        material = " Oak Wood";
        shape = "square";
        seatingCapacity = "10 people";
        color = "white marble";
        dimensions = "60x 30 x 20 inches";
        finish = "non Polished";
	 }
	
}
