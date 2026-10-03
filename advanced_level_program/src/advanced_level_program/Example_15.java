package advanced_level_program;
import java.util.Scanner;
import java.util.Stack;
public class Example_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		 
		Stack<Character> Stack = new Stack<>();

        boolean balanced = true;
        
        for (int i = 0; i < str.length(); i++) {
        	
        	char ch = str.charAt(i);
        	
        	if(ch == '(' || ch == '{' || ch == '[') {
        		Stack.push(ch);
        	}
        	else if(ch == ')' || ch == '}' || ch == ']') {
        	
        		if(Stack.empty()) {
        			balanced = false;
        			break;
        		}
        		
        		char top = Stack.pop();
        		
        		if(ch == ')' && top != '('  ||(ch == '{' && top != '}') ||(ch == '[' && top != ']')) {
        		
        			balanced = false;
        			break;
        		}
        	}
        }
        
        if(!Stack.empty()) {
        	balanced = false;
        }
        if(balanced) {
        	System.out.println("the parantheses are Balanced ");
        } else {
        	System.out.println("the paranthess are not balanced ");
        
        	sc.close();
        }
	}
}
        