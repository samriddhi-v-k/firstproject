class Laptop 
{
static String brand = "Dell";
static        String model = "XPS 15";
static        String processor = "Intel Core i7";
static        String ram = "16GB";
static        String storage = "512GB SSD";
static        String graphicsCard = "NVIDIA GeForce RTX 3050";
static        String screenSize = "15.6 inches";
static        String os = "Windows 11";
    public static void main(String laptop[]) 
	{

        System.out.println("The brand of the laptop is " + brand);
        System.out.println("The model of the laptop is " + model);
        System.out.println("The processor is " + processor);
        System.out.println("The RAM capacity is " + ram);
        System.out.println("The storage capacity is " + storage);
        System.out.println("The graphics card is " + graphicsCard);
        System.out.println("The screen size is " + screenSize);
        System.out.println("The operating system is " + os);
		brand = "hp";
        model = "XPS 19";
        processor = "Intel Core i9";
        ram = "17GB";
        storage = "600GB SSD";
        graphicsCard = "NVIDIA GeForce RTX 3090";
        screenSize = "17 inches";
        os = "Windows 13";
		Laptop.update();
		System.out.println("The brand of the laptop is " + brand);
        System.out.println("The model of the laptop is " + model);
        System.out.println("The processor is " + processor);
        System.out.println("The RAM capacity is " + ram);
        System.out.println("The storage capacity is " + storage);
        System.out.println("The graphics card is " + graphicsCard);
        System.out.println("The screen size is " + screenSize);
        System.out.println("The operating system is " + os);
		
    }
	 public static void update()
	 {
		  brand = "hp";
         model = "XPS 19";
         processor = "Intel Core i9";
         ram = "17GB";
         storage = "600GB SSD";
        graphicsCard = "NVIDIA GeForce RTX 3090";
         screenSize = "17 inches";
         os = "Windows 13";
	 }
}
