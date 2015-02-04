class Vehicle {
	public int speed;
	public String houkou;
	public String nameOfOwner;
	
	public static long nextID;
	public String number;
	
	public Vehicle() {
		nextID++;	
	}
	
	public Vehicle(String owner) {
		this();
		nameOfOwner = owner;
	}

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.speed = 1;
		vehicle1.houkou = "right";
		vehicle1.nameOfOwner = "ore";
		vehicle1.number = "01";
		System.out.println(max());
		System.out.println(vehicle1.toString());
	
	
		Vehicle vehicle2 = new Vehicle("aitsu");
		vehicle2.speed = 2;
		vehicle2.houkou = "up";
		vehicle2.number = "02";
		System.out.println(max());
		System.out.println(vehicle2.toString());
	
	}

	public static long max() {
		return nextID;
	}

	public String toString() {
		String printWords = this.speed + "," + this.houkou + "," + this.nameOfOwner + "," + this.nextID + "," + this.number;
		return printWords;
	}
}
