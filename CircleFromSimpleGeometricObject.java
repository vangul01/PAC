public class CircleFromSimpleGeometricObject
	extends SimpleGeometricObject 
		private double radius;

		public CircleFromSimpleGeometricObject() { 
		}

		public CircleFromSimpleGeometricObject(double radius) {
			this.radius = radius;
		}

		public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
			this.radius = radius;
			setColor(color);
			setFilled(filled);}
		}
		/** Return radius */
		public double getRadius() {
		 	return radius;
		}

		 /** Set a new radius */
		public void setRadius(double radius) {
		 	this.radius = radius;
		}

		/** Return area */
		public double getArea() {
			return radius * radius * Math.PI;
		}

		/** Return diameter */
		public double getDiameter() {
		 	return 2 * radius;
		}

		/** Return perimeter */
		public double getPerimeter() {
		 	return 2 * radius * Math.PI;
		}

		/** Print the circle info */
		public void printCircle() {
			System.out.println("The circle is created " + getDateCreated() +
			" and the radius is " + radius);
		}
}



/* 		String hey = "whats going on?";
 		System.out.println(hey);
 		blah(hey);
 	}
	public String blah(String x){
		return x;
	} 	
}

/*
 int x = 1;
 System.out.println("Before the call, x is " + x);

 System.out.println("After the call, x is " + increment(x));
 System.out.println("After After the call, x is " + x);
 }

 public static int increment(int n) {
 n++;
 System.out.println("n inside the method is " + n);
 return n;



		int x = 1;
		System.out.println("x inside main method: " + x);
 		
		System.out.println("calling x method in main: " + xMethod(x));

 		System.out.println("x passed through method, now in main: " + x);
 	
 	}

 	public static int xMethod(int x){
 		System.out.println("x before method: " + x);
 		x += 2; //should be 3 in here
 		System.out.println("the value of x inside xMethod: " + x);
 		return x;
 */


 //whats the byVal thing about then?? X is returned changed here
 //if you have a return type it works but if you try to change void you cant