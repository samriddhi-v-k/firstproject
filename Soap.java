class Soap 
{
    String ingredients;
    String packaging;
    String expirationDate;
	
	Soap()
	{
		System.out.println("the deafult constructor is created");
	}

    Soap(String ingredients, String packaging, String expirationDate) 
	{
        this.ingredients = ingredients;
        this.packaging = packaging;
        this.expirationDate = expirationDate;
    }
}
