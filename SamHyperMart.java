class SamHyperMart
{
static String myGroceries[]={"tata salt","maggi","cumin","vegetable oil","oats","lays","sugar","sauce","tea powder",
"coffee"};
static String perfumes[] = {"bella vita","engage","chanel","gucci","titan skinn","carolina","secret","dior","Valentino"
,"Tommy Hilfiger "};
static String biscuits[]={"Britannia","Sunfeast","Unibic","Patanjali ","Parle","Oreo","good day","krack Jack",
"Dukes","Marie Gold"};
static String veggies[]={"Garlic","Cauliflower","Sweet Potatoes","Carrots","Asparagus","Cabbage","Bitter melon",
	"Brinjal","Tomatoes","Green beans"};
	public static void main(String mart[])
	{
	System.out.println("the beginning of the main program");
	//System.out.println("the list of groceries which you have to buy are");
	//System.out.println(myGroceries[0]+" "+myGroceries[1]+" "+myGroceries[2]+" "+myGroceries[3]+" "+myGroceries[4]+" "+
	//myGroceries[5]+" "+myGroceries[6]+" "+myGroceries[7]+" "+myGroceries[8]+" "+myGroceries[9]);
	getgro();
	getper();
	getbis();
	getveg();
//	System.out.println("the list of perfume items are");
	//System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[4]+" "+perfumes[5]+" "+
	//perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
//	System.out.println("the list of the biscuits that you have to buy are:");
//	System.out.println(biscuits[0]+" "+biscuits[1]+" "+biscuits[2]+" "+biscuits[3]+" "+biscuits[4]+" "+biscuits[5]+" "+
	//biscuits[6]+" "+biscuits[7]+" "+biscuits[8]+" "+biscuits[9]);
//	System.out.println("the list of the veggies are");
	//System.out.println(veggies[0]+" "+veggies[1]+" "+veggies[2]+" "+veggies[3]+" "+veggies[4]+" "+veggies[5]+" "+
	//veggies[6]+" "+veggies[7]+" "+veggies[8]+" "+veggies[9]);
	System.out.println("the end of the program");
	}
	public static void getgro()
	{
		System.out.println("the groceries are:");
		for(String x :myGroceries){
			System.out.println(x);
		}
	}
	public static void getper()
	{
		System.out.println("the perfume are:");
		for(String y :perfumes){
			System.out.println(y);
		}
	}
	public static void getbis()
	{
		System.out.println("the biscuits are:");
		for(String z :biscuits){
			System.out.println(z);
		}
	}
	public static void getveg()
	{
		System.out.println("the veggies are:");
		for(String s:veggies){
			System.out.println(s);
		}
	}
}