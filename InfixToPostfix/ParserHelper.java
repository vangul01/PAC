/*_______________________________________________
Name: Valerie Angulo
Date: 12/5/2016
Project: Lab 10
Objective: ParserHelper
_________________________________________________*/
import java.util.*;

public class ParserHelper {

    public static List<String> parse(char[] input) {	//was initially private
	    List<String> parsed = new ArrayList<String>();
	    for (int i = 0; i < input.length; ++i) {
	        char c = input[i];
	        if (Character.isDigit(c)) {
	            String number = input[i] + "";
	            for (int j = i + 1; j < input.length; ++j) {
	                if (Character.isDigit(input[j])) {
	                    number += input[j];
	                    i = j;
	                } else {
	                    break;
	                }
	            }
	            parsed.add(number);
	        } else if (c == '*' || c == '/' || 
	                   c == '+' || c == '^' || 
	                   c == '-' || c == '(' || c == ')') {
	            parsed.add(c + "");
	        }
	    }
	    return parsed;
	}
}