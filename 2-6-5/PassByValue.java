class PassByValue {
	public static void main(String[] args) {
		double one = 1.0;

		System.out.println("before" + one);
		halveIt(one);
		System.out.println("after" + one);
	}

	public static void halveIt(double arg) {
		arg /= 2.0;
		System.out.println("halved" + arg);
	}
}
