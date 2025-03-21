class SamHotstar
{
static String hindimovies[] ={"chhichhore","blur","pink","atrangi re","dil bechara","kill","12th fail","hera pheri"
,"mrs","miss undercover","raabta"};
static String kanmovies[] ={"mr and mrs ramachari","raja huli","dia","KGF","hostel hudguru","kausalya supraja",
"kantara","777 charlie","max","yuva"};
static String malayalammovies[]={"manjummel boys","All We Imagine as Light","I Am Kathalan","Identity","Anand Sreebala",
"Mura","Pallotty 90's Kids","Kanakarajyam","Sookshmadarshini","Kadha Innuvare"};
static String englishmovies[] = {"harry potter","pirates of the carraibean","home alone","jurrasic park","mirrors",
"rings","IT","Joker","spider man","endgame"};
	public static void main (String fav[])
	{
	System.out.println("the beginning of the main program");
	//System.out.println(hindimovies[0]+" "+hindimovies[1]+" "+hindimovies[2]+" "+hindimovies[3]+" "+hindimovies[4]+" "+
    //hindimovies[5]+" "+hindimovies[6]+" "+hindimovies[7]+" "+hindimovies[8]+" "+hindimovies[9]);
	//System.out.println("the list of your fav hindi movies  are ");
	//System.out.println("the list of kannada movies the you have watched are");
	//System.out.println(kanmovies[0]+" "+kanmovies[1]+" "+kanmovies[2]+" "+kanmovies[3]+" "+kanmovies[4]+" "+kanmovies[5]+" "
	//+kanmovies[6]+" "+kanmovies[7]+" "+kanmovies[8]+" "+kanmovies[9]);
	//String malayalammovies[]={"manjummel boys","All We Imagine as Light","I Am Kathalan","Identity","Anand Sreebala",
	//"Mura","Pallotty 90's Kids","Kanakarajyam","Sookshmadarshini","Kadha Innuvare"};
	//System.out.println("the list of malayalam movies the you have watched are");
	//System.out.println(malayalammovies[0]+" "+malayalammovies[1]+" "+malayalammovies[2]+" "+malayalammovies[3]+" "+
	///malayalammovies[4]+" "+malayalammovies[5]+" "+malayalammovies[6]+" "+malayalammovies[7]+" "+malayalammovies[8]
	//+" "+malayalammovies[9]);
	//for(String mal:malayalammovies){
		//System.out.println(mal);
	//}
	//String englishmovies[] = {"harry potter","pirates of the carraibean","home alone","jurrasic park","mirrors",
	///"rings","IT","Joker","spider man","endgame"};
	//System.out.println("the list of english movies which you have watched are");
	//System.out.println(englishmovies[0]+" "+englishmovies[1]+" "+englishmovies[2]+" "+englishmovies[3]+" "+
	//englishmovies[4]+" "+englishmovies[5]+" "+englishmovies[6]+" "+englishmovies[7]+" "+englishmovies[8]
	///+" "+englishmovies[9]);
	//for (String eng:englishmovies){
		//System.out.println(eng);
	//}
	gethin();
	getkan();
	getmal();
	geteng();
	System.out.println("the end of the main program");
	}
	public static void gethin()
	{
		System.out.println("the hindi movies are:");
		for(String x:hindimovies){
			System.out.println(x);
			
		}
	}
	public static void getkan()
	{
		System.out.println("the kannada movies are:");
		for(String y:kanmovies){
			System.out.println(y);
			
		}
	}
	public static void getmal()
	{
		System.out.println("the malayalam movies are:");
		for(String z:malayalammovies){
			System.out.println(z);
			
		}
	}
	public static void geteng()
	{
		System.out.println("the english movies are:");
		for(String z:englishmovies){
			System.out.println(z);
			
		}
	}
	
	
	
	
	
	
}