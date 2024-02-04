package projects;
import java.util.Scanner;
import java.util.random.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to RPS!");
		Map<String, String> moves = new HashMap<>();
		moves.put("rock" , "🌑");
		moves.put("paper","📜");
		moves.put("scissors", "✂");
		List<String> validMoves = new ArrayList<>(moves.keySet());
		
		
	}
	
	public static void play_game() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Rock, paper or scissors: ");
		String user_move = inp.nextLine();
		if (!validMoves.contains(user_move)) {
			System.out.println("Invalid move.");
			return;
		}
	}

}
