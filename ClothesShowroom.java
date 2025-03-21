class ClothesShowroom
{
	public static void main(String arg[])
	{
		Clothes cloth= new Clothes();
		cloth.id =35;
		cloth.name = "trouser";
		cloth.size = 'M';
		cloth.type= "Cotton";
		
		System.out.println("the id of the cloth "+cloth.id);
		System.out.println("the name of the cloth is "+cloth.name);
		System.out.println("the size of the cloth is "+cloth.size);
		System.out.println("the type of the cloth is "+cloth.type);
		
		Clothes clothi =new Clothes();
		cloth.id= 56;
		cloth.name ="Skirt";
		cloth.size ='m';
		cloth.type = "silky";
		
		System.out.println("the id of the cloth "+cloth.id);
		System.out.println("the name of the cloth is "+cloth.name);
		System.out.println("the size of the cloth is "+cloth.size);
		System.out.println("the type of the cloth is "+cloth.type);
		Clothes cloth2 =new Clothes();
		cloth.id=32;
		cloth.name= "top";
		cloth.size ='xl';
		cloth.type ="Woolean";
		System.out.println("the id of the cloth "+cloth.id);
		System.out.println("the name of the cloth is "+cloth.name);
		System.out.println("the size of the slots is "+cloth.size);
	}
}