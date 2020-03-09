package epamcom.design;

public class Small extends Bike{

	 Small() {
		super(Biketype.SMALL);
		construct();
	}
	 public void construct(){
		 System.out.println("Building small car");
	 }

}