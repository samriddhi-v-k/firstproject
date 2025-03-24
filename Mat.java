class Mat 
{
    String texture;
    String thickness;
    String durability;
	
	Mat()
	{
		System.out.println("the deafult constructor is created");
	}

    Mat(String texture, String thickness, String durability) 
	{
        this.texture = texture;
        this.thickness = thickness;
        this.durability = durability;
    }
}
