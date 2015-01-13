class Vehicle {
	public int speed;
	public String houkou;
	public String nameOfOwner;
	
	public static long nextID;
	public String number;
	
	public Vehicle() {
	
	}
	
	public Vehicle(String owner) {
		nameOfOwner = owner;
	}

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.speed = 1;
		vehicle1.houkou = "right";
		vehicle1.nameOfOwner = "ore";
		vehicle1.nextID = 02;
		vehicle1.number = "01";
		System.out.println(vehicle1.speed + "," + vehicle1.houkou + "," + vehicle1.nameOfOwner + "," + vehicle1.nextID + "," + vehicle1.number);
	
	
		Vehicle vehicle2 = new Vehicle("aitsu");
		vehicle2.speed = 2;
		vehicle2.houkou = "up";
		vehicle2.nextID = 03;
		vehicle2.number = "02";
		System.out.println(vehicle2.speed + "," + vehicle2.houkou + "," + vehicle2.nameOfOwner + "," + vehicle2.nextID + "," + vehicle2.number);
	
	}
}
