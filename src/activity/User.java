package activity;

//USER REGISTRATION
public class User {

	// added validation methods to check each input field
	public String registerUser(String username, String password, int age) throws Invaliduserexception {
		getvalidaUsername(username);
		getvalidPassword(password);
		getvalidAge(age);
		System.out.println("Registering user: " + username);
		return "User " + username + " registered successfully!";
	}

	// after validation
	// checking username is null or not, if yes, throw exception
	private void getvalidaUsername(String username) throws Invaliduserexception {
		if (username == null || username.trim().isEmpty()) {
			throw new Invaliduserexception("Username cannot be null or empty.");
		}
	}

	// checking whether password is not null and length greater than 6
	private void getvalidPassword(String password) throws Invaliduserexception {
		if (password == null || password.length() < 6) {
			throw new Invaliduserexception("Password must be at least 6 characters long.");
		}
	}

	// checking age greater than 18
	private void getvalidAge(int age) throws Invaliduserexception {
		if (age < 18) {
			throw new Invaliduserexception("User must be at least 18 years old.");
		}
	}
}
