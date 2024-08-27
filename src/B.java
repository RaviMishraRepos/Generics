
// upper Bounded WildCard

import java.util.Arrays;
import java.util.List;

public class B {

	double printData(List<? extends Number> number) {

		double sum = 0.0;
		for (Number num : number) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = Arrays.asList(12, 23, 34, 45, 56, 324);
		B o = new B();
		System.out.println(o.printData(al));

		List<Double> al2 = Arrays.asList(12.34, 23.34, 34.34, 45.34, 56.34, 324.34);
		System.out.println(o.printData(al2));
	}

}
