package userExample;

public class App {

	public static void main(String[] args) {
		User myUser = new User.Builder("djain", "djain_ext@icontrol.com").firstName("dikshit").lastName("jain").build();
		System.out.println(myUser);
	}

}
