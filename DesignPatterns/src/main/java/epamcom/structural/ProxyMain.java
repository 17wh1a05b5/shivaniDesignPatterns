package epamcom.structural;

public class ProxyMain {

	public static void main(String[] args) {
		MediaFile m = new ProxyMedia("movie.mp3");
		m.printname();
		m.printname();
	}

}