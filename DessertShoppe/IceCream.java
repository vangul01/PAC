/*-----------------------------
Name: Valerie Angulo
Date: 11/5/2016
Assignment: Lab 8 IceCream
-------------------------------*/
public class IceCream 
	extends DessertItem {
		
	//data fields	
	private int cost;
	
	//no args constructor -not necessary bc Sundae has args constructor but good just in case
	public IceCream() {
	}
	//args constructor
	public IceCream(String name, int cost){
		super(name);	//method inherited from DessertItem
		this.cost = cost; 
	}
	//methods
	public int getCost() {
		return cost;
	}
	//returns string
	public String toString() {
		return String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s %" + DessertShoppe.COST_WIDTH + "s", 
			super.getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}