class ProcessValues {
	public static void main(String[] args) {
		String[] names = {"a", "b", "d"};
		processValues(names, new SimpleLookup());
	}

	static void processValues(String[] names, Lookup table) {
		for (int i = 0;i < names.length;i++) {
			Object value = table.find(names[i]);
			if (value != null) {
				processValue(names[i], value);
			}
		}
	}

	static void processValue(String name, Object value) {
		System.out.println(name + " : " + value);
	}
}
