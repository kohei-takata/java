class ImprovedFibnacci {
	static final int MAX_INDEX = 9;
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String mark;
		Number[] number = new Number[9];
		// System.out.println(MAX_INDEX + ": " + lo);
		number[0] = new Number(hi, hi % 2 != 0);
		for (int i = 1;i < MAX_INDEX;i++) {
			// System.out.println(i + ": " + hi + mark);

			number[i] = new Number(hi, hi % 2 != 0);
			hi = lo + hi;
			lo = hi - lo;
		}
		for(int i = 0;i < number.length;i++){
			if (number[i].isOdd){
				mark = "";
			} else {
				mark = " *";
			}
			System.out.println(i + ": " + number[i].num + mark);
		}
	}
}
