package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExample4 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("chandan");
		names.add("Amit");
		names.add("Alam");
		names.add("Bidur");
		names.add("Abhijeet");
		List<String> names1 = Arrays.asList("Kalpesh", "perwesh", "Ram", "Shyam", "Ishwar");
		Stream<String> newList = Stream.concat(names.stream(), names1.stream());
		newList.sorted().forEach(s -> System.out.println(s));
	}

}
