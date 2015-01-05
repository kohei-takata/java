class ComplexLookup implements ExtendLookup {
	private String[] names = new String[3];
	private Object[] values = new Object[3];

	public Object find(String name){
		for (int i = 0; i < names.length;i++) {
			if (names[i].equals(name)) {
				return values[i];
			}
		}
		return null;
	}

	public void add(String name, Object value) {
		for (int i = 0; i < names.length;i++) {
			if (names[i] == null) {
				names[i] = name;
				values[i] = value;
				return;
			}
		}
	}

	public void remove(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(name)) {
				names[i] = "";
				values[i] = null;
			}
		}
	}
}
