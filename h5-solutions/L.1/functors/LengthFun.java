// Homework 5. Lambda Expressions.

package functors;


public class LengthFun implements Functor <Integer, String> {
	@Override
	public Integer apply(String param) {
		return param.length();
	}

    private static void print(String s) {
	System.out.println(s);
    }
    
    public static void main(String[] args) {
    	String s1 = "This is a sample string";
	LengthFun lenfunctor = new LengthFun();
		
	Integer len1 = lenfunctor.apply(s1);
		
	print("7.a) len fun applied to '" + s1 + "' = " + len1);

	// Lambda:
	Functor<Integer, String> lenLambda = str -> str.length();
	print("7.a) lambda applied to '" + s1 + "' = " + lenLambda.apply(s1));

	// Method reference (not required for a correct solution):
	Functor<Integer, String> lenLambda2 = String::length;
	print("7.a) method reference applied to '" + s1 + "' = " + lenLambda2.apply(s1));
	
    }
}



