/*-----------------------------
Name: Valerie Angulo
Date: 11/5/2016
Assignment: Lab 8 Sundae
-------------------------------*/
public class Sundae 
	extends IceCream {
	//data fields
	private String iceCreamName;
	private int iceCreamPrice;
	private String toppingName;
	private int toppingPrice;
	//constructor
	public Sundae(String iceCreamName, int iceCreamPrice, String toppingName, int toppingPrice) {
		super(iceCreamName, iceCreamPrice);	
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}
	//methods
	public int getCost(){
		iceCreamPrice = super.getCost();
		return iceCreamPrice + toppingPrice;
	}
	//returns string
	public String toString() {
		return toppingName + " Sundae with\n" +
		String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s %" + DessertShoppe.COST_WIDTH + "s", 
			super.getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}	
}