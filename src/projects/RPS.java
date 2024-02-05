package projects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RPS {
	static Map<String, String> moves = new HashMap<>();
	static List<String> validMoves;
	
	public static void play_game(String user_move) {
		
		moves.put("rock" , "🌑");
		moves.put("paper","📜");
		moves.put("scissors", "✂");
		validMoves = new ArrayList<>(moves.keySet());
		
		if (!validMoves.contains(user_move)) {
			System.out.println("Invalid move.");
			return;
		}
		String aiMove = ai_move();
		displayMoves(user_move, aiMove);
		checkMoves(user_move, aiMove);
		
	}
	public static String ai_move() {
		Random random = new Random();
		int rand_index = random.nextInt(3);
		return validMoves.get(rand_index);
	}
	public static void displayMoves(String user_move, String ai_move) {
		System.out.println("----");
		System.out.println("You " + moves.get(user_move));
		System.out.println("Ai " + moves.get(ai_move));
		System.out.println("----");
	}
	public static void checkMoves(String user_move, String ai_move) {
		if (user_move.equals(ai_move)) {
			System.out.println("It is a tie.");
		}
		else if (user_move.equals("rock") && ai_move.equals("scissors")) {
			System.out.println("You win!");
		}
		else if (user_move.equals("scissors") && ai_move.equals("paper")) {
			System.out.println("You win!");
		}
		else if (user_move.equals("paper") && ai_move.equals("rock")) {
			System.out.println("You win!");
		}
		else {
			System.out.println("Ai wins!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to RPS!");
		Scanner inp = new Scanner(System.in);
		
		while (true) {
			System.out.print("Rock, paper or scissors: ");
			String user_move = inp.nextLine();
			play_game(user_move);
		}
	}
}
