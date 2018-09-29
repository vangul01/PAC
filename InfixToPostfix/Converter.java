/*_______________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: Converter class used to convert an 
infix expression into a postfix expression
_________________________________________________*/
import java.util.*;
import java.util.Scanner;

public class Converter {
	//string instance variable
	private String infix;	
	//default constructor									
	public Converter() {}
	//constructor with string parameter 									
	public Converter(String infix) {
		this.infix = infix;
	} 	

	public String toPostfix(String infix) {
		//create a stack for operators and String variable to hold postfix expression
		ArrayStack<String> stack  = new ArrayStack<String>(100);
		String postfix = ""; 
		//use a Scanner to separate operators and operands
  		Scanner tokenizer = new Scanner(infix);

  		while (tokenizer.hasNext()) {			
	  		String token = tokenizer.next();	

			if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
            	if (stack.isEmpty()) 
            	{
            		throw new StackUnderflowException
            		("Error: Cannot have closed parentheses with an empty stack");
            	} 
            	else 
            	{
	                while (!(stack.isEmpty() || stack.top().equals("("))) 
	                {
	                    postfix += stack.top() + " ";
	                    stack.pop();
	                } 
	                if (!stack.isEmpty()) 
	                {
	                	stack.pop();
	                }
            	}	
            } else if (token.equals("+") || token.equals("-")) {
                if (stack.isEmpty()) 
                { 
                    stack.push(token);
                } 
                else 
                {            	
                    while (!(stack.isEmpty() || stack.top().equals("(") 
                    	   || stack.top().equals(")"))) 
                    {
                        postfix += stack.top() + " ";
                        stack.pop();
                    } 
                    stack.push(token);
                }
            } else if (token.equals("*") || token.equals("/")) {
                if (stack.isEmpty() || stack.top().equals("(")) 
                {
                    stack.push(token);
                } 
                else 
                {
                    while (!(stack.isEmpty() || stack.top().equals("+") 
                    	   || stack.top().equals("-") || stack.top().equals("("))) 
                    {
                        postfix += stack.top() + " ";
                        stack.pop();
                    } 
                    stack.push(token);
            	}
            } else if (token.equals("^")) {
            		stack.push(token);
            } else {
                postfix += token + " ";
            }
        }
        //while stack isn't empty after tokenizer is done, pop off any remaining operators      
        while (!stack.isEmpty()) 
        {
            postfix += stack.top() + " ";
            stack.pop();
        }
        return postfix;
    }
}