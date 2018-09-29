/*-----------------------------
Name: Valerie Angulo
Date: 11/5/2016
Assignment: Lab 8 Checkout
Note: Ice cream prints with empty
line on top due to toString() in 
IceCream class
-------------------------------*/
public class Checkout 
	extends java.lang.Object {
	//data fields
	private int numberOfItems; 			
	private int totalCost;
	private int totalTax;
	private DessertItem[] dessertArray; 
	private final static int ONE_HUNDRED = 100;

	//constructor creates a Checkout instance with an empty array of DessertItem's with a size of 100
	public Checkout() {
		dessertArray = new DessertItem[100];
	}
	//Clears the Checkout to begin checking out a new set of items
	public void clear() {
		for (int i = 0; i < dessertArray.length - 1; i++) {
			dessertArray[i] = null;
		} numberOfItems = 0;
	}
	// A DessertItem is added to the end of the list of items
	public void enterItem(DessertItem item) {
		dessertArray[numberOfItems] = item;
		numberOfItems++;
	}
	//Returns the number of DessertItem's in the list
	public int numberOfItems() {
		return numberOfItems;
	}
	//Returns a String representing a receipt for the current list of items
	public java.lang.String toString() {
		String heading = DessertShoppe.STORE_NAME;
		String divider = "--------------------\n";
		String format = "%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s %" + DessertShoppe.COST_WIDTH + "s\n";

		//Dessert store header
		System.out.println("\n\n\t" + heading + "\n\t" + divider);
		//items purchased
		for (int i = 0; i < numberOfItems; i++) {
			System.out.println(dessertArray[i].toString());
		}
		return "\n" + String.format(format, "Tax:", DessertShoppe.cents2dollarsAndCents(totalTax)) +
		String.format(format, "Total Cost:", DessertShoppe.cents2dollarsAndCents(totalCost + totalTax));
	}
	//Returns total cost of items in cents (without tax)
	public int totalCost() {
		int addDessertCosts = 0;
		for (int i = 0; i < numberOfItems; i++){
			addDessertCosts += dessertArray[i].getCost(); 
		}
		totalCost = addDessertCosts;		
		return totalCost; 
	}
	//Returns total tax on items in cents
	public int totalTax() {
		totalTax = (int)(Math.round(totalCost * (DessertShoppe.TAX_RATE / ONE_HUNDRED))); 
		return totalTax;
	}
}