class Point {
	public double x, y;
	
	public void clear() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public double distance(Point that) {
		double xdiff = this.x - that.x;
		double ydiff = this.y - that.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
	}

	public void move(Point that) {
		this.x = that.x;
		this.y = that.y;
	}
}
