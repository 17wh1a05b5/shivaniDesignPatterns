package epamcom.behavioural;

public class Main {
	public static void main(String[] args){
		StaffMember s = new Programme();
		s.CometoWork();
		System.out.println();
		 s = new Supervisor();
		 s.CometoWork();
	}
}