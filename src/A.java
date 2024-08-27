import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//simple wildcard
public class A {

	<E> void printData(List<E> data) {
		for (E o : data) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {

	A o = new A();

	List data = Arrays.asList("Milan", "Rohit", "Jordan", "Ravi", 23);
		o.printData(data);

	}

}
