class Iphone 
{
static String brand = "Apple";
static String model = "iPhone 15 Pro Max";
static String processor = "A17 Pro Chip";
static   String storage = "512GB";
static   String color = "Titanium Blue";
static   String camera = "48MP Triple Camera System";
static   String battery = "4323mAh";
static   String os = "iOS 17";
    public static void main(String iphone[]) 
	{
         

        System.out.println("The brand of the phone is " + brand);
        System.out.println("The model of the phone is " + model);
        System.out.println("The processor is " + processor);
        System.out.println("The storage capacity is " + storage);
        System.out.println("The color of the phone is " + color);
        System.out.println("The camera setup is " + camera);
        System.out.println("The battery capacity is " + battery);
        System.out.println("The operating system is " + os);
		brand = "Apple";
        model = "iPhone 15 Pro Max";
        processor = "A17 Pro Chip";
        storage = "512GB";
        color = "Titanium Blue";
        camera = "48MP Triple Camera System";
        battery = "4323mAh";
        os = "iOS 17";
		Iphone.update();
		System.out.println("The brand of the phone is " + brand);
        System.out.println("The model of the phone is " + model);
        System.out.println("The processor is " + processor);
        System.out.println("The storage capacity is " + storage);
        System.out.println("The color of the phone is " + color);
        System.out.println("The camera setup is " + camera);
        System.out.println("The battery capacity is " + battery);
        System.out.println("The operating system is " + os);
    }
	public static void update()
	{
		brand = "Apple";
        model = "iPhone 15 Pro Max";
        processor = "A17 Pro Chip";
        storage = "512GB";
        color = "Titanium Blue";
        camera = "48MP Triple Camera System";
        battery = "4323mAh";
        os = "iOS 17";
	}
	
}