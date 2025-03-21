class Chocolates
{
static String chocos[]={"Dairy Milk","Dairy Milk Silk","Dairy Milk Fruit & Nut","Dairy Milk Crackle","Dairy Milk Roast Almond",
"Dairy Milk Caramel","Bournville (Dark Chocolate)","Temptations Almond Treat","Temptations Rum & Raisins",
"5 Star","5 Star 3D","Perk","KitKat","KitKat Dark","KitKat Dessert Delight","Munch","Munch Nuts","Bar One",
"Milky Bar (White Chocolate)","Snickers","Snickers Fruit & Nut","Mars Bar","Galaxy Smooth Milk","Galaxy Crispy",
"Galaxy Caramel","Ferrero Rocher","Toblerone","Hershey’s Kisses","Hershey’s Dark Chocolate","Lindt Excellence 70% Cocoa",
"Lindt Excellence 85% Cocoa","Amul Dark Chocolate","Amul Fruit & Nut Chocolate","Amul Milk Chocolate",
"LuvIt Lush","Chocwich","Dairy Rich","Lotus Biscoff Chocolate","Alpenliebe Juzt Jelly Chocolate","Skittles Chocolate"};
	public static void main(String sam[])
	{
		System.out.println("the beginning of the mai program");
	//System.out.println("the list of your fav chocos are"+chocos.length);
	//System.out.println(chocos[0]+" "+chocos[1]+" "+chocos[2]+" "+chocos[3]+" "+chocos[4]+" "+chocos[5]+" "+
	//chocos[6]+" "+chocos[7]+" "+chocos[8]+" "+chocos[9]+" "+chocos[10]+" "+chocos[11]+" "+chocos[12]+" "+chocos[13]+" "
	//+chocos[14]+" "+chocos[15]+" "+chocos[16]+" "+chocos[17]+" "+chocos[18]+" "+chocos[19]+" "+chocos[20]+" "+chocos[21]
	//+" "+chocos[22]+" "+chocos[23]+" "+chocos[24]+" "+chocos[25]+" "+chocos[26]+" "+chocos[27]+" "+chocos[28]+" "+chocos[29]
	//+" "+chocos[30]+" "+chocos[31]+" "+chocos[32]+" "+chocos[33]+" "+chocos[34]+" "+chocos[35]+" "+chocos[36]+" "+chocos[37]+" "+
	//chocos[38]+" "+chocos[39]);
		getcho();
		System.out.println("the end of the main program");
	}
	public static void getcho()
	{
		System.out.println("the chocolates are:");
		for(String x:chocos){
			System.out.println(x);
		}
	}
	
	
	
	
	}


