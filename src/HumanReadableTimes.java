import java.util.Scanner;

public class HumanReadableTimes {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in); 
			
			final int SECONDS_PER_MINUTE = 60;
			final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * 60;
			final int SECONDS_PER_DAY = SECONDS_PER_HOUR * 24;
			
			
			System.out.println("Please enter a number of seconds:");
			
			int totalSeconds = scnr.nextInt();

			
			int days = totalSeconds / SECONDS_PER_DAY;
			int hours = (totalSeconds % SECONDS_PER_DAY) / SECONDS_PER_HOUR;
			int minutes = (totalSeconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE;
			int seconds = totalSeconds % SECONDS_PER_MINUTE;
			
			
			System.out.println(days + " Day(s), " + hours + " Hour(s), "
								+ minutes + " Minute(s), " + seconds + " Second(s)");
		
		
		
		
	}

}
