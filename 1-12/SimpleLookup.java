class SimpleLookup implements Lookup {
	private String[] names = {"a", "b", "c"};
	private Object[] values = {"aa", "bb", "cc"};
	public Object find(String name) {
		for (int i = 0; i < names.length;i++) {
			if (names[i].equals(name)) {
				return values[i];
			}
		}
		return null;
	}
}
