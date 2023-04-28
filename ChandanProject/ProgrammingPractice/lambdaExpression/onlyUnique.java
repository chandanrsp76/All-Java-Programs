package lambdaExpression;

import java.util.stream.Stream;

public class onlyUnique {

	public static void main(String[] args) {
		Stream<Integer> values = Stream.of(2, 1, 2, 1, 4, 5, 1, 2, 3, 4, 2, 1);
		values.distinct().sorted().forEach(s -> System.out.println(s));
//		List<Integer> values = Arrays.asList(1, 4, 3, 2, 1, 3, 4, 5, 1, 2, 3, 1);
//		values.stream().distinct().sorted().forEach(s -> System.out.println(s));
		
		
		

	}

}
