class McDonaldsApp
{
public static void main(String foodie[])
{
	double bill=McDonalds.parcel("oreo crunch");
	System.out.println(bill);
	double billForMany=McDonalds.parcel("oreo crunch",14);
	System.out.println(billForMany);


}



}