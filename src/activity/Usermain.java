package activity;

public class Usermain {

	public static void main(String[] args) {
	
			User registration = new User(); //test cases go through error handling and test method
			testRegisterUser(registration, "alice", "@$hhuihiu9", 25);
			testRegisterUser(registration, "maxie", "pass 7656", 19);
			testRegisterUser(registration, "bob", "", 30);
			testRegisterUser(registration, null, "secret", 20);
			testRegisterUser(registration, "qwerty", "secret1", 12);
	}
			
			
			//method to check registration status
			private static void testRegisterUser(User registration, String username, String password, int age) {
			try {
			String result = registration.registerUser(username, password, age);
			System.out.println(result);
			}
			
			
			//catch exception if validation failed
			catch (Invaliduserexception e) { 
			System.out.println("Registration failed: " + e.getMessage());
			}
			
			}
			
	}


