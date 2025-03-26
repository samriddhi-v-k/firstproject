class Paper
{
	String pricePerPage;
	int noOfPages;
	int noOfSections;
	String comicPublished;
	String jewelleryAdName;
	String typeOfPaper;
	String famousControversyName;
	
	Paper()
	{
		System.out.println("the beginning of the constructor");		
	}

	Paper(String pricePerPage,int noOfPages,int noOfSections,String comicPublished,String jewelleryAdName,String typeOfPaper,String famousControversyName)
	{
		this();
		this.pricePerPage=pricePerPage;
		this.noOfPages=noOfPages;
		this.noOfSections=noOfSections;
		this.comicPublished=comicPublished;
		this.jewelleryAdName=jewelleryAdName;
		this.typeOfPaper=typeOfPaper;
		this.famousControversyName=famousControversyName;
		
	}
	public void publish()
	{
		System.out.println("the price per page is "+pricePerPage);
		System.out.println("the no of pages present in newspaper is "+noOfPages);
		System.out.println("the no of sections "+noOfSections);
		System.out.println("the comic published is "+comicPublished);
		System.out.println("the jewelleryAdName is "+jewelleryAdName);
		System.out.println("the type of paper is "+typeOfPaper);
		System.out.println("the famous controversy name "+famousControversyName);
	}


}