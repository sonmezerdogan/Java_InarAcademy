package chapters.chapter_03;

import java.util.Scanner;

public class Exercise3_05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        System.out.printf("Enter todays date: ");
        int date = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = in.nextInt();

        int future_date = (date + elapsed) % 7;
        String day_of_week = "";

        switch(date){
            case 0: day_of_week = "Sunday";
                    break;
            case 1: day_of_week = "Monday";
                    break; 
            case 2: day_of_week = "Tuesday";
                    break;
            case 3: day_of_week = "Wednesday";
                    break;
            case 4: day_of_week = "Thursday";
                   break;
            case 5: day_of_week = "Friday";
                    break;
            case 6: day_of_week = "Saturday";
                    break;
        }

        if (future_date == 0){
            System.out.printf("Todays is %s and the future day is Sunday", day_of_week);
        }else if(future_date == 1){
            System.out.printf("Todays is %s and the future day is Monday", day_of_week);
        }else if(future_date == 2){
            System.out.printf("Todays is %s and the future day is Tuesday", day_of_week);
        }else if(future_date == 3){
            System.out.printf("Todays is %s and the future day is Wednesday", day_of_week);
        }else if(future_date == 4){
            System.out.printf("Todays is %s and the future day is Thursday", day_of_week);
        }else if(future_date == 5){
            System.out.printf("Todays is %s and the future day is Friday", day_of_week);
        }else if(future_date == 6){
            System.out.printf("Todays is %s and the future day is Saturday", day_of_week);
        }
	}

}
