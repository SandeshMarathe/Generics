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

	public static float checkMaximum(Float d, Float e, Float f) {
		Float max = d;
		if(e.compareTo(max) > 0) {
			max = e;
		}
		if(f.compareTo(max) > 0) {
			max = f;
		}
		return max;
	}

	public static void main(String[] args) {
		int c = checkMaximum(10,23,15);
		float d = checkMaximum(12.5f, 13.4f, 22.0f);
		System.out.println(c);
		System.out.println(d);
	}

}
