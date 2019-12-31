package com.BridgeLabz.DataStructure.stack;

import java.util.Stack;

import com.bridgeLabz.util.Utility;

public class BalancedParanthesis {
	public static void main(String[] args) {
		try {
			Stack<String> stack = new Stack<>();
			boolean res = false, flag = true;
			System.out.println("Enter the equation to find paranthesis is banlanced or not ");
			String equation = Utility.inputName();
			String[] arr = equation.split("");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("(")) {
					stack.push(arr[i]);
				} else if (arr[i].equals(")")) {
					String n = stack.pop();
					if (n == null) {
						flag = false;
						System.out.println("not balanced");
					}

				}
			}
			if (flag) {
				res = stack.isEmpty();
			}
			if (res) {
				System.out.println("balanced");
			} else if (flag == true) {
				System.out.println("not balanced");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
