package epamcom.design;

public class Luxury extends Bike{
	 Luxury() {
		super(Biketype.LUXURY);
		construct();
	}

	public void construct(){
		System.out.println("Building luxury car");
		
	}

}