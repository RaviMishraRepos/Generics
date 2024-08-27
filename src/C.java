
// UnBounded Wildcard

import java.util.Arrays;
import java.util.List;

public class C {

	void printData(List<?> data) {
		for (Object o : data) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = Arrays.asList(12, 34, 56);
		C c = new C();
		c.printData(al);

		List<String> al2 = Arrays.asList("Rohit", "Mohit", "Milan");
		c.printData(al2);

	}

}
