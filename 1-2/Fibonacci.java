class Fibonacci {
	static final String TITLE = "フィボナッチ数列";
	static final int MAX = 50;
	public static void main(String[] args){
		int lo = 1;
		int hi = 1;
		System.out.println(TITLE);
		System.out.println(lo);
		while(hi < MAX){
			System.out.println(hi);
			hi = hi + lo;
			lo = hi - lo;
		}
	}
}
