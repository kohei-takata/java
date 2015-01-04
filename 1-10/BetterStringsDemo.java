class BetterStringsDemo {
	public static void main(String[] args){
		String myName = "Yamada";
		String occupation = "Reorganization Specialist";

		myName += " Arbiter";
		myName += " ";
		myName += "(" + occupation + ")";
		System.out.println("Name = " + myName);
	}
}
