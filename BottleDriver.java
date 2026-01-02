class BottleDriver 
{
	public static void main(String[] args) 
	{
	   Bottle b1 = new Bottle();
	   b1.brand = "Cello";
	   b1.price = 300.0;
	   b1.cap = 2;
	   b1.mat = "Glass";
	   b1.color = "Red";
	   
	   b1.printBrand().printPrice().printMaterial().printColor().printCapacity();
		   
	 }
}
