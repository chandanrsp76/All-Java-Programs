package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2, 3, 4, 2, 3, 4, 5, 6, 2, 3, 34, 23, 23, 42, 43);
		al.stream().sorted().distinct().forEach(s -> System.out.println(s));

	}

}
