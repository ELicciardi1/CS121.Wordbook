import java.util.Scanner;


public class storage {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter the number of layers:");
		int layers = scnr.nextInt();
		
		int[] currentRow = new int[layers + 1];
		int[] previousRow = new int[layers + 1];
		
		
		for (int i = 0 ; i <= layers ; i++) {
			
			currentRow[i] = 1;
			previousRow[i] = 1;
			
		}


		for (int i = 1 ; i <= layers ; i++) {
			
			System.out.print(currentRow[0]+"\t");
			
			if (i > 2) {
				
				
				for (int j = 0 ; j < (i-2) ; j++ ) {
					
				int sum = previousRow[j] + previousRow[j+1];
					
				System.out.print( sum + "\t");
				
				currentRow[j+1] = sum;
				
				}
			
			}
			
			if ( i > 1 ) {
				
			System.out.print(currentRow[i]+" ");	
				
			}
			
			
			System.arraycopy(currentRow, 0, previousRow, 0, currentRow.length);


			System.out.println();

		}

	}

}
