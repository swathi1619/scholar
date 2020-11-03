package practise;

import java.util.Stack;

public class Test {
	public static void main(String[] args) throws IOException {
		String[] tokens = new String[] {"2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}
	public static int evalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		for (String t : tokens){
			if (!operators.contains(t)) {
				//push to stack of it is a number stack.push(t);
			}
			else{
				//pop numbers from stack if it is an operator
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(a - b));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(a / b));
					break;
				}
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}

}
