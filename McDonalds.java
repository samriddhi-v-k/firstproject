class McDonalds
{
public static double parcel(String meal)
{
	double price=0.0;
	if(meal=="oreo crunch")
		price= 200;
	return price;
}
public static double parcel(String meal,int noOfMeals)
{
	double price=0.0;
	if(meal=="oreo crunch")
	 {
		price=200;
		price=price*noOfMeals; 
		return price;
	 }
	return price;
}
}




