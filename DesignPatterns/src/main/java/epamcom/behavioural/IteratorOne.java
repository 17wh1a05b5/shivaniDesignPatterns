package epamcom.behavioural;

public class IteratorOne {

	public static void main(String[] args) {
		Students std = new Students();
		for(Iterator itr = std.getIterator();itr.hasnext();){
			String student = (String)itr.next();
			System.out.println("Students:"+student);
		}
	}
}