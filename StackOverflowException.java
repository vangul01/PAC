/*_______________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: StackOverflow Exception
_________________________________________________*/
import java.util.*;

public class StackOverflowException 
	extends RuntimeException {	

	public StackOverflowException() {
		super();
	}

	public StackOverflowException(String message) {
		super(message);
	}
}