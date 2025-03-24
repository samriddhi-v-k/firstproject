class PhotoFrame 
{
    String borderStyle;
    String glassType;
    String price;

	
	PhotoFrame()
	{
		System.out.println("the deafult constructor is used");
	}
    PhotoFrame(String borderStyle, String glassType, String price) 
	{
        this.borderStyle = borderStyle;
        this.glassType = glassType;
        this.price = price;
    }
}