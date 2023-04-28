package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExample5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("chandan");
		names.add("Amit");
		names.add("Alam");
		names.add("Bidur");
		names.add("Abhijeet");
		List<String> names1 = Arrays.asList("Kalpesh","perwesh","Ram","Shyam","Ishwar","Rama");
		Stream<String> newList = Stream.concat(names.stream(), names1.stream());
		boolean rs = newList.anyMatch(s -> s.equalsIgnoreCase("ram"));
		System.out.println(rs);
		

	}

}
