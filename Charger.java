class Charger
{
static String brand="Costar";
static String connectorType = "USB Type C, USB Type A";
static String compatibleDevices =	"Tablets, Laptops, Mobile";
static String compatiblePhoneModels =	"Apple iPads: iPad Pro, iPad Air (4th generation and later)" ;
static String specialFeatureLightweight = "Design, Travel, Short Circuit Protection, Fast Charging";
static int inputVoltage = 240; 
	public static void main (String ch[])
	{
		System.out.println("the brand of the charger is " +brand );
		System.out.println("the connector type of the charger is " + connectorType);
		System.out.println("the compatible devices of the charger is " +compatibleDevices);
		System.out.println("the compatible phone models of the charger is " +compatiblePhoneModels);
		System.out.println("the special features of the charger is " +specialFeatureLightweight);
		System.out.println("the input voltage of the charger is " +inputVoltage );
		brand="boat";
		connectorType = "USB Type B, USB Type D";
		compatibleDevices =	"PC";
		compatiblePhoneModels =	"SAMSUNG,OPPO,VIVO,REALME" ;
		specialFeatureLightweight = "NO BATTERY OVERHEAT";
		inputVoltage = 100; 
		Charger.update();
		System.out.println("the brand of the charger is " +brand );
		System.out.println("the connector type of the charger is " + connectorType);
		System.out.println("the compatible devices of the charger is " +compatibleDevices);
		System.out.println("the compatible phone models of the charger is " +compatiblePhoneModels);
		System.out.println("the special features of the charger is " +specialFeatureLightweight);
		System.out.println("the input voltage of the charger is " +inputVoltage );
	}
	public static void update()
	{
		brand="boat";
		connectorType = "USB Type B, USB Type D";
		compatibleDevices =	"PC";
		compatiblePhoneModels =	"SAMSUNG,OPPO,VIVO,REALME" ;
		specialFeatureLightweight = "NO BATTERY OVERHEAT";
		inputVoltage = 100; 
	}
}