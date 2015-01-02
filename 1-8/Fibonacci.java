class Fibonacci {
	static final String TITLE = "フィボナッチ数列";
	static final int MAX = 50;
	public static void main(String[] args){
		int lo = 1;
		int hi = 1;
		int[] suuretsu = new int[9];
		System.out.println(TITLE);
		// System.out.println(lo);
		suuretsu[0] = lo;
		for(int i = 0;hi < MAX;i++){
			// System.out.println(hi);
			suuretsu[i + 1] = hi;
			hi = hi + lo;
			lo = hi - lo;
		}

		for(int i = 0; i < suuretsu.length; i++) {
			System.out.println(suuretsu[i]);
		}
	}
}
