class UsePoint {
	public static Point origin = new Point();
	public static void main(String[] args) {
		Point lowerLeft = new Point();
		Point upperRight = new Point();
		Point middlePoint = new Point();
		
		lowerLeft.x = 0.0;
		lowerLeft.y = 0.0;
		
		upperRight.x = 1280.0;
		upperRight.y = 1024.0;
		
		middlePoint.x = 640.0;
		middlePoint.y = 512.0;


		double d = lowerLeft.distance(upperRight);
		System.out.println(d);

		upperRight.move(lowerLeft);

		double d2 = lowerLeft.distance(upperRight);
		System.out.println(d2);
	}
}
