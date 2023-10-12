// Homework 5. Lambda Expressions.

package functors;

import java.util.Arrays;

// e)

public class MRExampleWithLambdas {
    private static void print(String s) {
	System.out.println(s);
    }

    public static void main(String[] args) {
	MyList<String> ls = new MyList<>();
	ls.addAll(Arrays.asList("Here", "comes", "the", "sun"));

	Integer totalChars = ls.map(String::length).reduce((x,y) -> x + y, 0);
	
	print("With lambdas: total characters in " + ls + " = " + totalChars);
    }
}
