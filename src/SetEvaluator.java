
import java.util.Scanner;

public class SetEvaluator {
	
	
	public static void main(String[] args) {
		
		// Needed to get data from user.
		// Passed into getInfroFromUser as to not make a new scanner for each card.
		
		Scanner scanner = new Scanner(System.in);
		
		// Creates array of cards
		
		Card[] completeDeck = new Card[3];
		
		
		// Loops to make 3 cards and get data for each card. 
		
		for (int i = 0 ; i < 3 ; i++ ) {
			
			completeDeck[i] = new Card();
			
			completeDeck[i].getInfoFromUser(scanner);
			
		}
	
		// Prints the result of the set checker.
		
		if ( Card.checkIfSet_All( completeDeck ) ) {
			
			System.out.println("The specified cards form a set");
			
		} else {
			
			System.out.println("The specified cards do not form a set");
			
		}
		

	}

	
}
