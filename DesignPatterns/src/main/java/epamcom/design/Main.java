package epamcom.design;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("Merry", "Joseph")
				.age(25)
				.phone("9356218901")
				.address("Hyderabad")
				.build();
		System.out.println(user1);
		User user2 = new User.UserBuilder("Abraham", "Sarah")
				.age(90)
				.address("France")
				.build();
		System.out.println(user2);

	}

}