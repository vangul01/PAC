/*-----------------------------
Name: Valerie Angulo
Date: 11/5/2016
Assignment: Lab 8 Candy
-------------------------------*/
public class Candy extends DessertItem {
	//data fields
	private double weight;
	private int pricePerPound;	
	private int cost;	

	//constructor with name inherited from DessertItem
	public Candy(String name, double weight, int pricePerPound) {	
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	//gets candy weight in pounds
	public double getWeightInPounds() {
		return weight;
	}
	//rounds to nearest cent and converts double to int
	public int getCost() {
		cost = (int)(Math.round(pricePerPound * weight)); 
		return cost; 	
	}
	//returns string
	public String toString() {
		return getWeightInPounds() + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(pricePerPound) + " /lb.\n" +
		String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s %" + DessertShoppe.COST_WIDTH + "s", 
			super.getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}