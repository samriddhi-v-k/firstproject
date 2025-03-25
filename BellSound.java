class BellSound
{
public static void main(String ring[])
{
	Bell handBell=new Bell("8","600","300");
	handBell.crossCheckBell();
	
	
	
	Bell toyBell=new Bell("5","700","150");
	toybell.crossCheckBell();
	
	Bell bicycleBell=new Bell("6","750","200");
	bicycleBell.crossCheckBell();
	
	Bell schoolBell=new Bell("12","500","800");
	System.out.println("the diameter is "+schoolBell.diameter);
	System.out.println("the sound pitch is "+schoolBell.pitch);
	System.out.println("thw weight is "+schoolBell.weight);
	System.out.println("");
	
	Bell templeBell=new Bell("10","450","1000");
	System.out.println("the diameter is "+templeBell.diameter);
	System.out.println("the sound pitch is "+templeBell.pitch);
	System.out.println("thw weight is "+templeBell.weight);
	System.out.println("");
	
	Bell jingleBell=new Bell("4","900","100");
	System.out.println("the diameter is "+jingleBell.diameter);
	System.out.println("the sound pitch is "+jingleBell.pitch);
	System.out.println("thw weight is "+jingleBell.weight);
	System.out.println("");
	
	Bell electronicBell=new Bell("7","850","250");
	System.out.println("the diameter is "+electronicBell.diameter);
	System.out.println("the sound pitch is "+electronicBell.pitch);
	System.out.println("thw weight is "+electronicBell.weight);
	System.out.println("");
	


}



}