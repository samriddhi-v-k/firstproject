class TastyFood
{
static String deliciousItems[] = {"manchow soup","idli","masala dosa","paneer manchurian","dry fruit salad",
"tiramisu","noodles","sunday special ice cream","tea","ghee rice"};
	public static void main (String food[])
	{
	System.out.println("the starting point of main program");
	getitem();
//	System.out.println("the total no of items on the hotel menu card are  "+deliciousItems.length);
//	System.out.println("the list of all the items are given below:");
//	System.out.println(deliciousItems[0]+" "+deliciousItems[1]+" "+deliciousItems[2]+" "+deliciousItems[3]+" "
//	+deliciousItems[4]+" "+deliciousItems[5]+" "+deliciousItems[6]+" "+deliciousItems[7]+" "+deliciousItems[8]
//	+" "+deliciousItems[9]);
	System.out.println("the end point of main program");
	}
	public static void getitem()
	{
		
		System.out.println("the items are:");
		for(String del :deliciousItems){
			
			System.out.println(del);
		}
		
	}
}