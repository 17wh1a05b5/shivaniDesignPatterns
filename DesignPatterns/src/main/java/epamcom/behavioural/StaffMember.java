package epamcom.behavioural;

public abstract class StaffMember {
	abstract void takework();
	abstract void takebreak();
	abstract void takepay();
	public final void CometoWork(){
		takework();
		takebreak();
		takework();
		
	}	

}