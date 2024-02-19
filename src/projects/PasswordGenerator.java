package projects;
import java.util.Random;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = generatePassword(20, true, true);
		System.out.print("password: ");
		System.out.println(password);
	}
	public static String generatePassword(int length, boolean upper, boolean symbols) {
		String newPassword = "";
		Random random = new Random();
		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String punctuation = "?.!,_-:;'[]()";
        String combination = lowercaseLetters + digits;
		if (upper) {
			combination += uppercaseLetters;
		}
		if (symbols) {
			combination += punctuation;
		}
		for (int i = 0; i < length; i++) {
			int randIndex = random.nextInt(combination.length());
			newPassword += combination.charAt(randIndex);
		}
		return newPassword;
	}
}
