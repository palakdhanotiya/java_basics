import java.util.Scanner;

public class WeeksAndDays {
    public static void main (String[] args ){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days : ");
        int days = sc.nextInt();

        int weeks = days/7;
        int remainingDays = days%7;

        System.out.println(days + " days is equal to " + weeks + " weeks and " + remainingDays + " days.");
        sc.close();
    }
    
}
