/*
The Cookie class should be derived from the DessertItem class. A Cookie item has
a number and a price per dozen which are used to determine its cost. For example, 4
cookies @ 399 cents /dz. = 133 cents. The cost should be rounded to the nearest cent.

   checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));

*/

public class Cookie
	extends DessertItem {
	
	//data fields
	private String name;
	private int number;
	private int pricePerDozen;
	final private int DOZEN = 12;
	private double cost;
	
	//constructor
	public Cookie(String name, int number, int pricePerDozen){
		super.getName(name); //method inherited from DessertItem
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	//methods
	public int getNumberOfCookies() {
		return number;
	}

	public int getCost(int number) {		//check this
		this.number = number;
		cost = (double)(pricePerDozen / DOZEN) * number;
		return (int)cost;
	}
}