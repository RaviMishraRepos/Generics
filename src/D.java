
//lowerBound wildcard

import java.util.Arrays;
import java.util.List;

public class D {

	void printData(List<? super Integer> data) {
		for (Object o : data) {
			System.out.println(o);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Number> num = Arrays.asList(1.2,32.3,334,43512312312l);
		D o = new D();
		o.printData(num);
		
	}

}
