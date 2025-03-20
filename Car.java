class Car
{
static  String brand = "Toyota";
static  String model = "Camry";
static  String fuelType = "Hybrid";
static  String color = "Blue";
static  String engineCapacity = "2.5L";
    public static void main(String car[])
    {
        System.out.println("The brand of the car is " + brand);
        System.out.println("The model of the car is " + model);
        System.out.println("The fuel type is " + fuelType);
        System.out.println("The color of the car is " + color);
        System.out.println("The engine capacity is " + engineCapacity);
		brand = "mahindra";
        model = "vintage";
        fuelType = "petrol";
        color = "red";
        engineCapacity = "5L";
		Car.update();
		System.out.println("The brand of the car is " + brand);
        System.out.println("The model of the car is " + model);
        System.out.println("The fuel type is " + fuelType);
        System.out.println("The color of the car is " + color);
        System.out.println("The engine capacity is " + engineCapacity);
		
    }
	public static void update()
	{
		brand = "mahindra";
        model = "vintage";
        fuelType = "petrol";
        color = "red";
        engineCapacity = "5L";

		
	}
}
