public class GenericUC {

	public static int checkMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0) {
			max = y;
		}
		if(z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		int c = checkMaximum(10,23,15);
		System.out.println(c);
	}

}
