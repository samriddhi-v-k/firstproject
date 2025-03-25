class SoapHouse
{
public static void main(String soapy[])
{
	Soap herbalSoap=new Soap("Neem, Tulsi, Aloe Vera","Paper Wrap","24 Months");
	System.out.println("the ingredients are "+herbalSoap.ingredients);
	System.out.println("the packaging is of type "+herbalSoap.packaging);
	System.out.println("the expirationDate is "+herbalSoap.expirationDate);
	System.out.println("");
	
	Soap moisturizingSoap=new Soap("Shea Butter, Almond Oil","Plastic Wrap","18 Months");
	System.out.println("the ingredients are "+moisturizingSoap.ingredients);
	System.out.println("the packaging is of type "+moisturizingSoap.packaging);
	System.out.println("the expirationDate is "+moisturizingSoap.expirationDate);
	System.out.println("");
	
	Soap antibacterialSoap=new Soap("Tea Tree Oil, Triclosan","Box Packaging","36 Months");
	System.out.println("the ingredients are "+antibacterialSoap.ingredients);
	System.out.println("the packaging is of type "+antibacterialSoap.packaging);
	System.out.println("the expirationDate is "+antibacterialSoap.expirationDate);
	System.out.println("");
	
	Soap transparentSoap=new Soap("Glycerin, Coconut Oil","Plastic Box","30 Months");
	System.out.println("the ingredients are "+transparentSoap.ingredients);
	System.out.println("the packaging is of type "+transparentSoap.packaging);
	System.out.println("the expirationDate is "+transparentSoap.expirationDate);
	System.out.println("");
	
	Soap charcoalSoap=new Soap("Activated Charcoal, Clay","Paper Box","24 Months");
	System.out.println("the ingredients are "+charcoalSoap.ingredients);
	System.out.println("the packaging is of type "+charcoalSoap.packaging);
	System.out.println("the expirationDate is "+charcoalSoap.expirationDate);
	System.out.println("");
	
	Soap handmadeSoap=new Soap("Essential Oils, Herbs","Cloth Wrap","12 Months");
	System.out.println("the ingredients are "+handmadeSoap.ingredients);
	System.out.println("the packaging is of type "+handmadeSoap.packaging);
	System.out.println("the expirationDate is "+handmadeSoap.expirationDate);
	System.out.println("");
	
	Soap medicatedSoap=new Soap("Salicylic Acid, Sulfur","Foil Wrap","36 Months");
	System.out.println("the ingredients are "+medicatedSoap.ingredients);
	System.out.println("the packaging is of type "+medicatedSoap.packaging);
	System.out.println("the expirationDate is "+medicatedSoap.expirationDate);
	System.out.println("");

}


}