package projects;
import java.util.ArrayList;
import java.util.Random;
public class Dicerolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static ArrayList roll_dice(int amount) {
		if (amount < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
		
		Random random = new Random();
		ArrayList<Integer> rolls = new ArrayList<>();
		try {
            
            while(amount > 0) {
            	int random_roll = random.nextInt(6) + 1;
            	rolls.add(random_roll);
            	amount --;
            } 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
		return rolls;
	}
}
