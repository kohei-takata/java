class Vehicle {
	public int speed;
	public String houkou;
	public String nameOfOwner;
	
	public static long nextID;
	public String number;

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.speed = 1;
		vehicle1.houkou = "right";
		vehicle1.nameOfOwner = "ore";
		vehicle1.nextID = 02;
		vehicle1.number = "01";
		System.out.println(vehicle1.speed + "," + vehicle1.houkou + "," + vehicle1.nameOfOwner + "," + vehicle1.nextID + "," + vehicle1.number);
	}
}
