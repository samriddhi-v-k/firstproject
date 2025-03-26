class WireBundle
{
public static void main(String wire[])
{
	Wire polyCab= new Wire("copper","12 AWG","PVC","20A","240 volt","10 meters");
	System.out.println(polyCab);
	polyCab.bundle();
}


}