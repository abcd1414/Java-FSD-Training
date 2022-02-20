import java.util.Stack;

public class Stack_sampledouble{
	
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Double> stk= new Stack<>();  
// checking stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
// pushing elements into stack  
stk.push(78.5);  
stk.push(113.2);  
stk.push(90.6);  
stk.push(120.3);  
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
stk.pop();
System.out.println("The last element is " + stk.peek());  
System.out.println("The position of 113.2 in the stack is :" + stk.search(113.2));  
}
}