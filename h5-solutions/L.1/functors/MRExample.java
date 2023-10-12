// Homework 5. Lambda Expressions.

package functors;

import java.util.Arrays;

// d)

public class MRExample {
    private static void print(String s) {
	System.out.println(s);
    }

    public static void main(String[] args) {
	MyList<String> ls = new MyList<>();
	ls.addAll(Arrays.asList("Here", "comes", "the", "sun"));

	MyList<Integer> li = ls.map(new LengthFun());

	Integer totalChars = li.reduce(new Summer(), 0);

	// same as:
	totalChars = ls.map(new LengthFun()).reduce(new Summer(), 0);
	
	print("Total characters in " + ls + " = " + totalChars);
    }
}
