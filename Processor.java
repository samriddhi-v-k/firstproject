class Processor 
{
static String	brand = "Generic";
static	String	cpuManufacturer = "Intel";
static	String	cpuModel = "Core i7 4800MQ";
static	String	cpuSpeed = "3.2 GHz";
static	String  cpuSocket = "LGA 1150";
public static void main(String pro[])
	{
		System.out.println("the brand of the processor is" +brand);
		System.out.println("the cpuManufacturer of the processor is" +cpuManufacturer);
		System.out.println("the cpuModel of the processor is" +cpuModel);
		System.out.println("the cpuSpeed of the processor is" +cpuSpeed);
		System.out.println("the cpuSocket of the processor is" +cpuSocket);	
		brand = "Generic 1";
		cpuManufacturer = "Intel 2";
		cpuModel = "Core i7 4800MQ 45";
		cpuSpeed = "5 GHz";
	    cpuSocket = "LGA 1180";
		Processor.update();
		System.out.println("the brand of the processor is" +brand);
		System.out.println("the cpuManufacturer of the processor is" +cpuManufacturer);
		System.out.println("the cpuModel of the processor is" +cpuModel);
		System.out.println("the cpuSpeed of the processor is" +cpuSpeed);
		System.out.println("the cpuSocket of the processor is" +cpuSocket);	
	}
	public static void update()
	{
		brand = "Generic 1";
		cpuManufacturer = "Intel 2";
		cpuModel = "Core i7 4800MQ 45";
		cpuSpeed = "5 GHz";
	    cpuSocket = "LGA 1180";
	}
	
}