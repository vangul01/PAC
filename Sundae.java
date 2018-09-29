/*
The IceCream class should be derived from the DessertItem class. An IceCream item
simply has a cost. The Sundae class should be derived from the IceCream class.
The cost of a Sundae is the cost of the IceCream plus the cost of the topping.

    checkout.enterItem(new Sundae("Choc. Chip Ice Cream",145, "Hot Fudge", 50));
*/

public class Sundae 
	extends IceCream {
	//data fields
	private String iceCreamName;
	private int iceCreamPrice;
	private String toppingName;
	private int toppingPrice;
	//constructor
	public Sundae(String iceCreamName, int iceCreamPrice, String toppingName, int toppingPrice) {
//		getName(iceCreamName);
		super(iceCreamName);	//constructor chaining
		super.getCost();		//calls superclass IceCream getCost method
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}
	//methods
	public int getCost(){
		cost = iceCreamPrice + toppingPrice;
		return cost;
	}
}