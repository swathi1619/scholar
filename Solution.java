package practise;

import java.util.Stack;

public class Solution {
		public void evalRPN(String[] tokens) {
			int returnValue = 0;
			String operators = "+-*/";
			Stack<String> stack = new Stack<String>();
			for (String t : tokens){
				if (!operators.contains(t)) {
					stack.push(t);
				}
				else{
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
			returnValue = Integer.valueOf(stack.pop());
			return;
		}

	}

}
