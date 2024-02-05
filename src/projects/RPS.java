package projects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RPS {
	Map<String, String> moves = new HashMap<>();
	List<String> validMoves = new ArrayList<>(moves.keySet());
	
	public void play_game(String user_move) {
		
		moves.put("rock" , "🌑");
		moves.put("paper","📜");
		moves.put("scissors", "✂");
		
		if (!validMoves.contains(user_move)) {
			System.out.println("Invalid move.");
			return;
		}
		String aiMove = ai_move();
		
		
	}
	public String ai_move() {
		Random random = new Random();
		int rand_index = random.nextInt(3);
		return validMoves.get(rand_index);
	}
	public void displayMoves(String user_move, String ai_move) {
		System.out.println("----");
		System.out.println("You " + moves.get(user_move));
		System.out.println("You " + moves.get(ai_move));
		System.out.println("----");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to RPS!");
		Scanner inp = new Scanner(System.in);
		System.out.print("Rock, paper or scissors: ");
		String user_move = inp.nextLine();
		
	
	
	
	}

}
