package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExample3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("chandan","Amit","Harsh","Kalpesh","candan");
		names.stream().filter(s->s.startsWith("c")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));

	}

}
