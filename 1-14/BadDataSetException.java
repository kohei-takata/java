import java.io.IOException;

class BadDataSetException extends Exception {
	private String setName;
	private IOException e;

	BadDataSetException(String setName, IOException e){
		this.setName = setName;
		this.e = e;
	}
}
