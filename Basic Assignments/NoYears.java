import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        int MINUTES_IN_A_DAY = 24 * 60; // 1440 minutes in a day
        int DAYS_IN_A_YEAR = 365;
        long totalDays = minutes / MINUTES_IN_A_DAY;
        long years = totalDays / DAYS_IN_A_YEAR;
        long remainingDays = totalDays % DAYS_IN_A_YEAR;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");

       
    }
}
