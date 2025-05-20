package lab_04;
import java.util.Scanner;

class ResultsTracker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Results Tracker!");
        System.out.println("Enter classroom strength :");
        int strength = scanner.nextInt();


        int[] Marks;
        String[] Names;

        Marks = new int[strength];
        Names = new String[strength];
        for(int i=0;i<strength;i++){
            scanner.nextLine();
            System.out.println("Name : ");
            String name = scanner.nextLine();
            Names[i] = name;
            System.out.println("Marks : ");
            int mark = scanner.nextInt();
            Marks[i] = mark;
        }

        for(int i=0;i<strength;i++){
            System.out.println("Name : " + Names[i]);
            System.out.println("Marks : "+ Marks[i]);

        }
        highestMarksAndSum(Marks, Names);

        scanner.close();

    }

    public static void highestMarksAndSum(int[] marks, String[] names){
        int highestMark = 0;
        int sum = 0;
        String highestName = "";
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
            if(marks[i]>highestMark){
                highestMark = marks[i];
                highestName = names[i];
            }
        }
        System.out.println("Highest marks "+highestMark+ " scored by" + highestName);
        System.out.println("Sum of scored Marks "+sum);
    }
}
