class Colors
{
public static void main(String co[])

	{
	System.out.println("main started");
	String colors[] = {"blue","violet","tael","lavender"};
	System.out.println("the total no of elements are "+colors.length);
	for (String x :  colors)
	{
	System.out.println("the color elements are given as   " + x);	
	}
	///other way of printing is 
	System.out.println("the colors are given as :" );
	System.out.println(colors[0] + " " +colors[1] + " " +colors[2] + " " +colors[3] );
	
	String alphabets[]={"1","2","3","4"};
	System.out.println("the numbers are :");
	System.out.println(alphabets[0]+ " "+alphabets[1]+" "+alphabets[2]+ " "+alphabets[3]);
	System.out.println("main end");
	}
}
///length :property of array variable i.e index -1
///int :it is a written type of length value
