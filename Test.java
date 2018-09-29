public class Test {
 	public static void main(String[] args) {

 		Dog myDog = new Dog();	//just created a new Dog object myDog is a reference to an object
 		myDog.setSize(30);
 		myDog.bark();
 		Dog yourDog = new Dog();
 		yourDog.setSize(15);
 		Dog aDog = new Dog();
 		aDog.setSize(50);
 		yourDog.bark();
 		aDog.bark();
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