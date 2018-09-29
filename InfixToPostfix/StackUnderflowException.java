/*_______________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: StackUnderflow Exception
_________________________________________________*/
import java.util.*;

public class StackUnderflowException 
	extends RuntimeException {	

	public StackUnderflowException() {
		super();
	}

	public StackUnderflowException(String message) {
		super(message);
	}
}