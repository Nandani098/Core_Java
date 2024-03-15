package in.co.rays.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		String[] name = { "one", "Two", "Three", "four" };

		Stream<String> s = Arrays.stream(name);

		// s.forEach(e->{System.out.println(e);});

		/*
		 * s.sorted().forEach(e -> { System.out.println(e); });
		 */

		s.filter(e -> e.startsWith("T")).map(e -> e.toUpperCase()).distinct().sorted().forEach(e -> {
			System.out.println(e);
		});
	}
}