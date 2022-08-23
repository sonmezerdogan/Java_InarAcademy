package chapters.chapter_02;

public class Exercise2_08 {

	public static void main(String[] args) {

		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes /60;
		
		long currentHour = totalHours % 24;
		
		System.out.println("Current Time is " + ( currentHour - 5 ) + " : " + currentMinute + " : " + currentSecond);
		
	}

}
