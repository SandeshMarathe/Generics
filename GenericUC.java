public class GenericUC {

public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
		T max = elements[0];
		for(T maximumParametereter : elements) {
			if(maximumParametereter.compareTo(max) > 0) {
				max = maximumParametereter;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Integer c = checkMaximum(10,23,15);
		Double d = checkMaximum(12.5, 13.4, 22.0);
		String s = checkMaximum("Apple", "Peach", "Banana");
		Integer c1 = checkMaximum_With_MoreThan_ThreeParameters(10,23,15,20,24);
		Double d1 = checkMaximum_With_MoreThan_ThreeParameters(12.5, 13.4, 22.0,24.0,20.8);
		String s1 = checkMaximum_With_MoreThan_ThreeParameters("Apple", "Peach", "Banana", "Mango", "Orange");
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(s1);
	}
}
