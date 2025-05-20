package lab_04;
import java.util.Scanner;

class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = scanner.nextLine();

        Boolean result = DayOfWeek.isWorkDay(day);
        System.out.println(day +" is "+  (result ? "working" : "holiday"));

        scanner.close();

    }

    public static enum DayOfWeek {
        monday, tuesday, wednesday, thurdsday, friday, saturday, sunday;

        private static boolean isWorkDay(String day){
            if (day.toLowerCase().equals("sunday") || day.toLowerCase().equals("saturday")){
                return false;
            } else {
                return true;
            }
        }
    }
}
