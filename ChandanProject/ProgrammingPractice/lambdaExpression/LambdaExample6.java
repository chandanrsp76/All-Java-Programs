package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample6 {

	public static void main(String[] args) {
	 Stream.of("Chandan", "Pritam", "Ishwar", "Raju", "Ram")
	    .filter(s -> s.endsWith("m")).map(s -> s.toUpperCase()).
	    collect(Collectors.toList()).forEach(s->System.out.println(s));
		//System.out.println(names.get(1));

	}

}
