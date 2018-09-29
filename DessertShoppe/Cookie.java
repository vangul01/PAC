/*-----------------------------
Name: Valerie Angulo
Date: 11/5/2016
Assignment: Lab 8 Cookie
-------------------------------*/
public class Cookie
	extends DessertItem {
	
	//data fields
	private int number;
	private int pricePerDozen;
	private int cost;
	private final static double DOZEN = 12.0;
	
	//constructor with name inherited from DessertItem
	public Cookie(String name, int number, int pricePerDozen){
		super(name); 
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	//gets number of cookies
	public int getNumberOfCookies() {
		return number;
	}
	//gets cost of cookies with price per dozen and number of cookies
	public int getCost() {
		cost = (int)(Math.round((pricePerDozen / DOZEN) * number));	
		return cost;
	}
	//returns string
	public String toString() {
		return number + " @ " + DessertShoppe.cents2dollarsAndCents(pricePerDozen) + " /dz.\n" +
		String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s %" + DessertShoppe.COST_WIDTH + "s", 
			super.getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}

}