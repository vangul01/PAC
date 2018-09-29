/*
The IceCream class should be derived from the DessertItem class. An IceCream item
simply has a cost. The Sundae class should be derived from the IceCream class.
The cost of a Sundae is the cost of the IceCream plus the cost of the topping.
    
    checkout.enterItem(new IceCream("Vanilla Ice Cream",105));
*/

public class IceCream 
	extends DessertItem {
	//data fields
	private String name;	
	private int cost;
	
	//no args constructor -not necessary bc Sundae has args constructor but good just in case
	public IceCream() {
	}
	//args constructor
	public IceCream(String name, int cost){
		super.getName(name);	//method inherited from DessertItem
		this.cost = cost; 
	}
	//methods
	public int getCost() {
		return cost;
	}
}