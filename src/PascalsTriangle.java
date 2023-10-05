
import java.util.Scanner;

public class PascalsTriangle {
	

	
	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	
	
	pascalsTriangle(scanner);
			
	
	scanner.close();
	
		
	
	}

	
	
	
	public static int pascalsTriangle(Scanner scanner) {
		
		System.out.println("Enter the number of layers:");
		
		int layers = scanner.nextInt();
		
		if (layers == 0) {
			return 1;
		} else if (layers == 1) {
			System.out.print(1);
			return 1;
		} else if (layers == 2) {
			System.out.println(" "+1);
			System.out.println(1+" "+1);
			return 1;
		} else {
		
		int[][] pyramid = new int[layers][layers];
		
		
		
		
		printPyramid(pyramid);
		return 0;
		
		} 
		
	}
	
	public static void initializeToOne (int[][] pyramid) {
		
		for (int i = 0 ; i < pyramid.length ; i++) {
			
			for (int j = 0 ; j < pyramid.length ; j++) {
				
				pyramid[i][j] = 0;
				
			}
			
		}
		
	}
	
	public static void printPyramid (int[][] pyramid) {
		
			setPyramid(pyramid);
			
			int cellWidth = getCellWidth(pyramid);
			int cellValue;
		
			for (int i = 0 ; i < pyramid.length ; i++) {
				
				printStartingSpaces(pyramid.length-i , cellWidth);
				
				for (int j = 1 ; j < pyramid.length ; j++) {
					
					
					
					if ( pyramid[i][j] > 0) {
						
					cellValue = pyramid[i][j];
						
					printCell(cellValue,cellWidth);
					
					}
					
					if (i == pyramid.length - 1 && j == pyramid.length - 1) {
						printCell(1,cellWidth);
					}
					
				}
				
				System.out.println();
				
			}
			
			
		}
	
	public static void setPyramid (int[][] pyramid) {
		
		initializeToOne(pyramid);
		
		pyramid[0][1] = 1;
		pyramid[1][1] = 1;
		pyramid[1][2] = 1;
				
			
			for (int i = 2 ; i < pyramid.length ; i++) {
				
				for (int j = 1 ; j < pyramid.length ; j++) {
					
					pyramid[i][j] = pyramid[i-1][j] + pyramid[i-1][j-1];
					
				}
				
			}
			
		}
	
	public static int  getCellWidth (int[][] pyramid) {
		
		int highestValue = 0;
		
		
		for (int i = 0 ; i < pyramid.length ; i++) {
			
			if ( pyramid[pyramid.length - 1][i] > highestValue ) {
				
				highestValue = pyramid[pyramid.length - 1][i];
				
			}
			
			
		}
		
		
		String numStr = Integer.toString(highestValue);
		
		int length = numStr.length();
		
		if (length % 2 == 0) {
			
			length += 2;
			
		} else {
			
			length += 1;
			
		}

		return length;
		
	}
			
	public static void printStartingSpaces (int row, int cellWidth) {
		
		
		for (int i = row; i > 1 ; i--) {
			
			for (int j = 0 ; j < (cellWidth/2) ; j++) {
				
				System.out.print(" ");
				
			}
			
		}
		
		
	}
	
	public static void printCell (int cellValue, int cellWidth) {
		
		String numStr = Integer.toString(cellValue);
		
		int length = numStr.length();
		
		for (int i = 0 ; i < cellWidth - length ; i++) {
			
			System.out.print(" ");
			
		}
		
		System.out.print(cellValue);
		
	}

}