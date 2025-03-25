class ChainJewellery
{
public static void main(String chain[])
{
	Chain cableChain= new Chain("Simple Links","Lobster Clasp","18K Gold");
	System.out.println("the design is "+cableChain.design);
	System.out.println("the claspType is "+cableChain.claspType);
	System.out.println("the purity is "+cableChain.purity);
	System.out.println("");
	
	Chain curbChain= new Chain("Flattened Links","Spring Ring","22K Gold");
	System.out.println("the design is "+curbChain.design);
	System.out.println("the claspType is "+curbChain.claspType);
	System.out.println("the purity is "+curbChain.purity);
	System.out.println("");
	
	Chain figaroChain= new Chain("Alternating Links","Lobster Clasp","925 Silver");
	System.out.println("the design is "+figaroChain.design);
	System.out.println("the claspType is "+figaroChain.claspType);
	System.out.println("the purity is "+figaroChain.purity);
	System.out.println("");
	
	Chain ropeChain = new Chain("Twisted Design","Barrel Clasp","14K Gold");
	System.out.println("the design is "+ropeChain.design);
	System.out.println("the claspType is "+ropeChain.claspType);
	System.out.println("the purity is "+ropeChain.purity);
	System.out.println("");
	
	Chain boxChain= new Chain("Square Links","Hook Clasp","Platinum");
	System.out.println("the design is "+boxChain.design);
	System.out.println("the claspType is "+boxChain.claspType);
	System.out.println("the purity is "+boxChain.purity);
	System.out.println("");
	
	Chain snakeChain= new Chain("Smooth & Flexible","Magnetic Clasp","18K Gold");
	System.out.println("the design is "+snakeChain.design);
	System.out.println("the claspType is "+snakeChain.claspType);
	System.out.println("the purity is "+snakeChain.purity);
	System.out.println("");
	
	Chain beadChain= new Chain("Small Beads","Ball Clasp","925 Silver");
	System.out.println("the design is "+beadChain.design);
	System.out.println("the claspType is "+beadChain.claspType);
	System.out.println("the purity is "+beadChain.purity);
	System.out.println("");
}


}