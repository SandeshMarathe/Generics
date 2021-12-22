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

	public static String checkMaximum(String s1, String s2, String s3) {
		String max = s1;
		if(s2.compareTo(max) > 0) {
			max = s2;
		}
		if(s3.compareTo(max) > 0) {
			max = s3;
		}
		return max;
	}

	public static void main(String[] args) {
		int c = checkMaximum(10,23,15);

		String s = checkMaximum("Apple", "Peach", "Banana");
		System.out.println(c);

		System.out.println(s);
	}

}
