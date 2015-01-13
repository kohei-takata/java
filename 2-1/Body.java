class Body {
	public long idNum;
	public String name = "<unnamed>";
	public Body orbits = null;

	public static long nextID = 0;

	Body() {
		idNum = nextID++;
	}
}
