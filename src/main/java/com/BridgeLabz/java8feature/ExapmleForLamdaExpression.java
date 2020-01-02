package com.BridgeLabz.java8feature;
/*
 * passing multiple value in parameter and writing lamda expression
 */

@FunctionalInterface
interface StringConcat {

    public String sconcat(String a, String b);
}
public class ExapmleForLamdaExpression {

   public static void main(String args[]) {
        // lambda expression with multiple arguments
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
        System.out.println("Result: "+s.sconcat("vikash ", "kumar"));
    }
}
