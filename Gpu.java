class Gpu 
{
static String brand = "NVIDIA";
static String model = "GeForce RTX 4090";
static String memory = "24GB GDDR6X";
static String clockSpeed = "2.52 GHz";
static String powerConsumption = "450W";
static String architecture = "Ada Lovelace";
    public static void main(String gpu[])
	{
        System.out.println("The brand of the GPU is " + brand);
        System.out.println("The model of the GPU is " + model);
        System.out.println("The memory capacity is " + memory);
        System.out.println("The clock speed is " + clockSpeed);
        System.out.println("The power consumption is " + powerConsumption);
        System.out.println("The architecture used is " + architecture);
		brand = "amazon";
        model = "GeForce RTX ";
        memory = "26GB GDDR6X";
        clockSpeed = "3 GHz";
        powerConsumption = "50W";
        architecture = "infra";
		Gpu.update();
		System.out.println("The brand of the GPU is " + brand);
        System.out.println("The model of the GPU is " + model);
        System.out.println("The memory capacity is " + memory);
        System.out.println("The clock speed is " + clockSpeed);
        System.out.println("The power consumption is " + powerConsumption);
        System.out.println("The architecture used is " + architecture);
    }
	public static void update(){
		brand = "amazon";
         model = "GeForce RTX ";
         memory = "26GB GDDR6X";
        clockSpeed = "3 GHz";
         powerConsumption = "50W";
        architecture = "infra";
	}
}
