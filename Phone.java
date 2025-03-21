class Phone
{
static String brand = "Samsung";
static  String model = "Galaxy S23";
static   String os = "Android";
static        String color = "Phantom Black";
static        String storage = "256GB";
    public static void main(String phone[])
    {
        System.out.println("The brand of the phone is " + brand);
        System.out.println("The model of the phone is " + model);
        System.out.println("The operating system is " + os);
        System.out.println("The color of the phone is " + color);
        System.out.println("The storage capacity of the phone is " + storage);
		brand = "iphone";
        model = "15";
        os = "apple";
        color = "red";
        storage = "280GB";
		Phone.update();
		
        System.out.println("The brand of the phone is " + brand);
        System.out.println("The model of the phone is " + model);
        System.out.println("The operating system is " + os);
        System.out.println("The color of the phone is " + color);
        System.out.println("The storage capacity of the phone is " + storage); 	
		
    }
	public static void update(){
		
	
		brand = "iphone";
        model = "15";
        os = "apple";
        color = "red";
        storage = "280GB";
	}

}
