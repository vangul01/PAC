//object oriented programming how objects work together
//object defined by state and behaviors (variables and methods)

import javax.swing.JOptionPane;
import java.util.*;

public class Dog {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a string");
		String token = input.next();

		System.out.println("The String is numeric: " + isNumeric(token));

	}
	public static boolean isNumeric(String token) {
		boolean numeric = false;
		System.out.println(Double.parseDouble(token));

//		return numeric;

		if(StringUtils.isNumeric()){
			numeric = true;
		} else
			numeric = false;
		return numeric;
	}
}





/*	
public static void main(String[] args) {
try {
method();
System.out.println("After the method call");
}
catch (RuntimeException ex) {
System.out.println("RuntimeException in main");
}
catch (Exception ex) {
System.out.println("Exception in main");
}
}
static void method() throws Exception {
try {
String s = "abc";
System.out.println(s.charAt(3));
}
catch (RuntimeException ex) {
System.out.println("RuntimeException in method()");
}
catch (Exception ex) {
System.out.println("Exception in method()");
}
}
}
/*

public static void main(String[] args) {
try {
int[] list = new int[10];
System.out.println("list[10] is " + list[10]);
}
catch (ArithmeticException ex) {
System.out.println("ArithmeticException");
}
catch (RuntimeException ex) {
System.out.println("RuntimeException");
}
catch (Exception ex) {
System.out.println("Exception");
}
}
}

*/

/*
// RUNTIME EXCEPTION...WHY?
//public class Dog {
public static void main(String[] args) {
try {
method();
System.out.println("After the method call");
}
catch (ArithmeticException ex) {
System.out.println("ArithmeticException");
}
catch (RuntimeException ex) {
System.out.println("RuntimeException");
}
catch (Exception e) {
System.out.println("Exception");
}
}
static void method() throws Exception {
	System.out.println(1 / 0);
}
}




/*
public class Dog 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 2; i++) 
		{
			System.out.print(i + " ");
			
			try 
			{
				System.out.println(1 / 0);
			}
				catch (Exception ex) 
			{
				System.out.println("nothings wrong!");
			}
		}

	    class Exception 
	    extends RuntimeException 
	    {
			public Exception() 
			{
				super();
			}
			public Exception(String message) 
			{
				super(message);
			}
		}	
	}
}






/*	public static void main (String args[]) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value:");
		int a = input.nextInt();
		System.out.println("Enter another value:");
		int b = input.nextInt();

		try
		{
			int result = divide(a, b);
			System.out.println("Your result is: " + result);
		} catch(ArithmeticException e) 
		{
			System.out.println("Can't divide by zero, sorry!");
		}
	}

	public static int divide(int a, int b) throws ArithmeticException
	{
		if (b == 0) {
			throw new ArithmeticException("can\'t divide by zero!");
		}
		return (a / b);
	}
}

    class ArithmeticException 
    extends RuntimeException {
	public ArithmeticException() {
		super();
	}
	public ArithmeticException(String message) {
		super(message);
	}	
}




/*
		//times table
		int[][] matrix = new int[10][10]; 

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++){
				matrix[i][j] = i*j;
				System.out.print(" " + matrix[i][j]);
			} System.out.println(" ");
		}
	}
}


/*		long number, fibonacciValue;
		String numberAsString;
		numberAsString = JOptionPane.showInputDialog("What Fib value do you want?");
		number = Long.parseLong( numberAsString );

		fibonacciValue = fibonacci( number );             
		
		System.out.println (fibonacciValue);
		System.exit (0);
		
	} 

	// recursive declaration of method fibonacci         
	public static long fibonacci( long n )                      
	{                                                    
		if ( n == 0 || n == 1 )                           
			return n;
		else                                              
			return fibonacci( n - 1 ) + fibonacci( n - 2 );
	} // end method fibonacci

}	



/*
	{																	//main, FF1, FF2, FF2
		for (int i = 1; i < 10; i++)									//1
			System.out.println ( i + "! = " + findFactorial(i));		//return 2*1
	}

	public static int findFactorial (int number) 
	{
		if ( number <= 1)
			return 1;
		else
			return (number * findFactorial (number-1));
	}

/*	public static void main (String args[]) 
	{
		upAndDown(1);							//main upAndDown(1) upAndDown(2) upAndDown(3) upAndDown(4)
		System.out.println();					//upAndDown(4) upAndDown(3) upAndDown(2) upAndDown(1) main()
	}

	public static void upAndDown (int n) 
	{
		System.out.print ("\nLevel: " +  n);	//1 2 3 4
		if (n < 4)
			upAndDown (n+1);					//2 3 4
		System.out.print ("\nLEVEL: " + n);		//4 3 2 1 
	}
*/





/*
	int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};

	System.out.println(m1(array)[0]); //[2,4] --> 2
	System.out.println(m1(array)[1]); //[2,4] --> 4
	}

	public static int[] m1(int[][] m) 
	{
	int[] result = new int[2];
	result[0] = m.length;
	result[1] = m[0].length;
	return result;
	}
}







/*
	A a = new A(3, true);	

	}
}

class A {
	int x;	//no x is being passed into first so its never 3
	boolean b;
public A() {
	//since theres no this.x = x, it keeps the value for int from 2nd constructor...
	System.out.println(" Hey!");
	System.out.println("int in first constructor = " + x + " boolean in second cons. = " + b);	//x = 5 b =false
}
public A(int x) { 
	this();	//goes to no params const.
	this.x = x;	//the x thats being passed in is 5
	System.out.println(" Whats going ");
	System.out.println("int in second constructor = " + x + " boolean in second cons. = " + b); //x = 5 b= false
}
public A(int x, boolean b) {
	this(5); //goes to 1 param const.
	this.x = x; //3 passed in but not set to x. 
	System.out.println("boolean = " + b + " int = " + x);	//x = 3 b = false
	System.out.println("on?");
}
}


//it appears that the boolean value I set in 1 param constructor determines boolean values for all constructors
//However, int is a different case: In first constructor int is 7, in second, 7 and in third 5




/*
public class Dog {
public static void main(String[] args) {
Object circle1 = new Circle();
Object circle2 = new Circle();
System.out.println(circle1.equals(circle2));
}
}
/*
//dunno why this comes out as false? Maybe because there is no Circle object, only Object object so its automatically false?
class Circle {
double radius;
public boolean equals(Circle circle) {
return this.radius == circle.radius;
}
}
*/
//true because casts Objet as circle and makes radius equal circles radius
//even if Object circle is Circle circle in the test class, still true because Circle is always an Object, but not always ice versa

/*
class Circle {
double radius;
public boolean equals(Object circle) {
return this.radius == ((Circle)circle).radius;
}
}






/*
public class Dog {	//This shows that when methods from super are called for a subclass object, after visiting the superclass method,
	//JVM goes back to subclass for the overriden method..what if the method wasnt overriden? it would remain in the superclass, it only 
	//jumps back to subclass because there is a newer method applicable to that subclass object

	//this program shows how subclasses inherit methods from superclasses and that once method is called, goes back to subclass
	public static void main(String[] args) {
		new Person().printPerson();
		new Student().printPerson();
	}
}
class Student extends Person {
	public Student() {
		//default constructor
		System.out.println("visiting constructor Student");
	}
	@Override
	public String getInfo() {
		return "Student";
	}
}
class Person {
	public Person(){
		//default constructor
		System.out.println("visiting constructor Person");
	}
	public String getInfo() {
		return "Person";
	}
	public void printPerson() {
		System.out.println("visiting printPerson");
		System.out.println(getInfo());
	}
}

/*
class SuperClass
{
    public void method1()
    {
        System.out.println("superclass method1");
    //    this.method2();		//refers to subclass object
    }

    public void method2()
    {
        System.out.println("superclass method2");
    }

}

class SubClass extends SuperClass
{
    @Override
    public void method1()
    {
        System.out.println("subclass method1");
        super.method1();
        super.method2();		//one of only ways to access overriden method2 in superclass
    }

    @Override
    public void method2()
    {
        System.out.println("subclass method2");
    }
}



public class Dog
{
    public static void main(String[] args) 
    {
        SubClass mSubClass = new SubClass();
        mSubClass.method1();
    }
}





/*
public class Dog {
public static void main(String[] args) {
new A();
new B();
}
}

class A {
int i = 7;
public A() {
setI(20);
System.out.println("i from A is " + i);
}
public void setI(int i) {
this.i = 2 * i;
}
}

class B extends A {
public B() {
System.out.println("i from B is " + i);
}
public void setI(int i) {
this.i = 3 * i;
}
}

// ************************QUESTION******************
 public class Dog {  //Why is Bs constructor invoked if Bs constructor has no args and As does, output is Bs const invoked, then As
 	//const invokes...Because whenever a class has a super class, the first thing the constructor does is initialize constructor of the 
 	//superclass. Aka every program initializes constructor of Object class, its just that we dont see it cause its default
 	//Also: superclasses need the most general of constructors and stuff, like with no args and whatever (can have doublw constructors) but 
 	//its good style to have no args just in case
	 public static void main(String[] args) {
	 	A a = new A(3);
	 }
 }

 class A extends B {
	 public A(int t) {
	 	System.out.println("A's constructor is invoked");
	 }
 }

 class B {
	 public B() {
		 System.out.println("B's constructor is invoked");
	 }
}

/*
public class Dog {
	private int size; 

	public void bark() {
		if (size == 30){
			System.out.println("Woof Woof! I am the sir! :)");
		} else if (size > 30) {
			System.out.println("Hey Im a big dog, WOOOOF!");
		} else 
			System.out.println("Yo wuudup, small dog here 8)");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

*/