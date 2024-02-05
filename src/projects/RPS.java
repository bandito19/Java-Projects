package projects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RPS {
	static Map<String, String> moves = new HashMap<>();
	static List<String> validMoves = new ArrayList<>(moves.keySet());
	
	public static void play_game(String user_move) {
		
		moves.put("rock" , "🌑");
		moves.put("paper","📜");
		moves.put("scissors", "✂");
		
		if (!validMoves.contains(user_move)) {
			System.out.println("Invalid move.");
			return;
		}
		String aiMove = ai_move();
		
		
	}
	public static String ai_move() {
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
	public void checkMoves(String user_move, String ai_move) {
		if (user_move == ai_move) {
			System.out.println("It is a tie.");
		}
		else if (user_move == "rock" && ai_move == "scissors") {
			System.out.println("You win!");
		}
		else if (user_move == "scissors" && ai_move == "paper") {
			System.out.println("You win!");
		}
		else if (user_move == "paper" && ai_move == "rock") {
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
		System.out.print("Rock, paper or scissors: ");
		String user_move = inp.nextLine();
		while (true) {
			play_game(user_move);
		}
	}
}
