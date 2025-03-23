class Stove
{
	String noOfBurners;
	String material;
	String childLock;
	String gasLeakDetector;
	
	Stove()
	{
		System.out.println("default constuctor of stove is being created");
	
	}
	
	Stove(String noOfBurners,String material,String childLock,String gasLeakDetector)
	{
		this.noOfBurners=noOfBurners;
		this.material=material;
		this.childLock=childLock;
		this.gasLeakDetector=gasLeakDetector;
	}


}