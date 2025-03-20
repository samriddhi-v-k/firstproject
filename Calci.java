class Calci
{
public static int add(int a,int b)
{	
	int c =a+b;
	System.out.println(" the sum of "+a +" and "+ b+ " is "+ c);
	return c;
	
}
public static int sub(int a,int b)
{	
	int c =a-b;
	System.out.println(" the difference of "+a +" and "+ b+ " is "+ c);
	return c;
}

public static int mul(int a,int b)
{	
	int c =a*b;
	System.out.println(" the product of "+a +" and "+ b+ " is "+ c);
	return c;
}
public static int div(int a,int b)
{	
	int c =a-b;
	System.out.println(" the division of "+a +" and "+ b+ " is "+ c);
	return c;
}
public static int mod(int a,int b)
{	
	int c =a%b;
	System.out.println(" the modulus of "+a +" and "+ b+ " is "+ c);
	return c;
}
}