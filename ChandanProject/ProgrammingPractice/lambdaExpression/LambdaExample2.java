package lambdaExpression;

import java.util.ArrayList;

public class LambdaExample2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("chandan");
		names.add("Aman");
		names.add("Amit");
		names.add("Pritam");
		names.add("Ishwar");
		names.add("Adan");
		Long count = names.stream().filter(s -> s.startsWith("A") && s.endsWith("n")).count();
		System.out.println(count);

	}

}
