import java.util.Scanner;

public class Card {

	private static int numberOfCards = 1;
	
	private int number;
	private String color;
	private String fill;	
	private String type;
	
	
	/**
	* Each card has four qualities: Number, Color, Fill, and Shape.
	 * Number can only be 1, 2, or 3.
	 * Color can only be red, green, or purple.
	 * Fill can only be solid, striped, or empty.
	 * Shape can be diamond, oval, or squiggly.
	 */
	
	public Card () {
		
	}
	
	/**
	* Prompts the user to fill in the information to complete the card.
	* If the user inputs a quality that does not exist, prints "Error" and loops.
	* Once completed all fields, increments the total number of cards (static).
	*/
	
	public void getInfoFromUser (Scanner scanner) {
	
		number = promptUserInt(scanner , 3 , 1);
		
		color = promptUserString(scanner, "color", "red", "green", "purple");
		
		fill = promptUserString(scanner, "fill" , "solid", "striped", "empty");
		
		type = promptUserString(scanner, "shape" , "diamond", "oval", "squiggly");
		
		incrementCard();
		
	}
	
	/**
	* Takes in a integer and compares it to an upper and lower limit.
	* If it is within the range, returns true, else returns false.
	*/
	
	private boolean checkInputInt (int input, int top, int bottom) {
		
		if (input <= top && input >= bottom) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
	/**
	* Takes in a String and compares it to three options.
	* If it matches one of the options, returns true, else returns false.
	*/
	
	private boolean checkInputString (String input, String option1, String option2, String option3) {
		
		if ( input.equals(option1) || input.equals(option2) || input.equals(option3) ) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	/**
	* Takes in a Scanner to prompt the user for a quality and compares it to three options.
	* Returns a integer when it matches one of the options.
	*/
	
	private int promptUserInt (Scanner scanner, int upper, int lower) {
		
		while (true) {
			
			System.out.println("Enter the number of shapes for card " + numberOfCards + ":");
			
			
			if ( scanner.hasNextInt() ) {
				
				int number = scanner.nextInt();
				
				if( checkInputInt(number, upper, lower) == true ) {
					
					
					return number;
					
				} 
				
			} 
				
				System.out.println("Invalid input");
				scanner.nextLine();
					
			
		}
		
	}
	
	/**
	* Takes in a Scanner to prompt the user for a quality and compares it to the three options.
	* Returns a String when it matches one of the options.
	*/
	
	private String promptUserString (Scanner scanner, String cardQuality, String option1,String option2,String option3) {

		while (true) {
			
			System.out.println("Enter the " + cardQuality + " for card " + numberOfCards + ":");
			
				String userInput = scanner.next();
				
				if( checkInputString(userInput, option1, option2, option3) == true ) {
					
					return userInput;
					
				} 
				
			
				
				System.out.println("Invalid input");
				
				// If multiple inputs, this clears the scanner so there is not overflow into the next loop.
				
				scanner.nextLine();
					
			
		}
	}
	
	/**
	* Increments number of cards by one.
	*/
	
	private static void incrementCard() {
		numberOfCards++;
	}
	
	/**
	* Takes in data type integer and returns true if the cards are all the same or all different.
	*/
	
	private static boolean checkIfSet_Int (int cardOneNumber, int cardTwoNumber, int cardThreeNumber) {
			
		if(cardOneNumber == cardTwoNumber && cardTwoNumber == cardThreeNumber && cardOneNumber == cardThreeNumber){
				
				return true;
				
		} else if (cardOneNumber != cardTwoNumber && cardTwoNumber != cardThreeNumber && cardOneNumber != cardThreeNumber){
				
				return true;
				
		} else {
				
				return false;
				
		}
			
	}
		
	/**
	* Takes in data type string and returns true if the cards are all the same or all different.
	*/
		
	private static boolean checkIfSet_String (String cardOneString, String cardTwoString, String cardThreeString) {
		
		if( cardOneString.equals(cardTwoString)  &&  cardTwoString.equals(cardThreeString) ){
				
			return true;
				
		} else if ( !cardOneString.equals(cardTwoString)  &&  !cardTwoString.equals(cardThreeString) &&  !cardOneString.equals(cardThreeString) ){
				
			return true;
				
		} else {
				
			return false;
				
		}
			
	}
		
	/**
	* Uses methods checkIfSet_String and checkIfSet_Int to return true if the whole deck (only three cards) is a set.
	*/
		
	public static boolean checkIfSet_All (Card[] completeDeck) {
			
		boolean numberIsSet = checkIfSet_Int   ( completeDeck[0].getNumber() , completeDeck[1].getNumber() , completeDeck[2].getNumber() );
		boolean colorIsSet  = checkIfSet_String( completeDeck[0].getColor()  , completeDeck[1].getColor()  , completeDeck[2].getColor()  );
		boolean fillIsSet   = checkIfSet_String( completeDeck[0].getFill()   , completeDeck[1].getFill()   , completeDeck[2].getFill()   );
		boolean typeIsSet   = checkIfSet_String( completeDeck[0].getType()   , completeDeck[1].getType()   , completeDeck[2].getType()   );
			
		return numberIsSet && colorIsSet && fillIsSet && typeIsSet;
		
	}
		

		

	
	
	// Auto Generated Getters and Setters.

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}
	
	
}
