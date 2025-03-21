class Character
{
static char nums[] = {'0','1','2','3','4','5','6','7','8','9'};
	public static void main(String letters[])
	{
		System.out.println("the beginning of the main program");
	//char nums[] = {'0','1','2','3','4','5','6','7','8','9'};
	//System.out.println("the array of numbers are given below");
	//System.out.println(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]+" "+nums[4]+" "+nums[5]+" "+nums[6]+
	//" "+nums[7]+" "+nums[8]+" "+nums[9]);
		getlet();
		System.out.println("the end of the main program");
	}
	public static void getlet()
	{
		System.out.println("the numbers are:");
		for(char y : nums){
			System.out.println(y);
		}
	}
}