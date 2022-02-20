import java.util.Stack;

public class Stack_sample_char{
	
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Character> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push('A');  
stk.push('B');  
stk.push('C');
stk.push('D');  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
stk.pop();
System.out.println("The last element is " + stk.peek());  
System.out.println("The position of A in the stack is :" + stk.search('A'));  
}
}
