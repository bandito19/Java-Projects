package projects;
import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner inp = new Scanner(System.in);
		int random_number = random.nextInt(1,10);
		System.out.println("Geuss a numbre in the range from 1 to 10. You have 3 tries.");
		int tries = 3;
		int guess = 0;
		while(true) {
			if (tries > 0) {
				try {
					System.out.print("Guess: ");
					guess = inp.nextInt();
					tries -= 1;
				}
				catch (InputMismatchException e) {
					System.out.println("Please enter a valid number");
				}
			}
			else {
				System.out.println("sorry, You ran out of tries.");
				break;
			}
			if (guess>random_number) {
				System.out.println("Try a smaller number.");
			}
			else if (guess < random_number) {
				System.out.println("Try a bigger number.");
			}
			else {
				System.out.println("You guessed it.");
				break;
			}
		}
	}

}
