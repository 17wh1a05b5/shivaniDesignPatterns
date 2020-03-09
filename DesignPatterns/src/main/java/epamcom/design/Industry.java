package epamcom.design;

public class Industry {
	public static Bike buildCar(Biketype model){
		 Bike bike = null;
	        switch (model) {
	        case SMALL:
	            bike = new Small();
	            break;
	        case LUXURY:
	            bike = new Luxury();
	            break;
	 
	        default:
	            break;
	        }
	        return bike;
		
	}

}