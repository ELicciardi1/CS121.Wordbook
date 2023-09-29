
import java.util.Scanner;

public class PascalsTriangle {
	

	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("Layers: ");
	int layers = scanner.nextInt();
	
	int[][] pyramid = new int[layers][layers];
	
	
	setPyramid(pyramid);
	
	printPyramid(pyramid);
	
	
	
	
	

		
	}

	public static void initializeToOne (int[][] pyramid) {
		
		for (int i = 0 ; i < pyramid.length ; i++) {
			
			for (int j = 0 ; j < pyramid.length ; j++) {
				
				pyramid[i][j] = 0;
				
			}
			
		}
		
	}
	
	public static void printPyramid (int[][] pyramid) {
			
			for (int i = 0 ; i < pyramid.length ; i++) {
				
				for (int j = 1 ; j < pyramid.length ; j++) {
					
					if ( pyramid[i][j] > 0) {
						
					System.out.print(pyramid[i][j]);
					
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
			

}