package lab_03;
import java.util.Scanner;

class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Operation ('Compare' | 'Copy' | 'Concatente' | 'Off') : ");
        String text = scanner.nextLine();


        while(!text.equals("Off")){

            if(text.equals("Compare")){
                System.out.print("Enter Text 1 : ");
                String text1 = scanner.nextLine();
                System.out.print("Enter Text 2 : ");
                String text2 = scanner.nextLine();
                Boolean result = CompareStrings(text1, text2);
                String call = result ? " equals " : " not equal ";
                System.out.print("\n"+text1 + call + "to " + text2);
            } else if(text.equals("Concatente")){
                System.out.print("Enter Text 1 : ");
                String text1 = scanner.nextLine();
                System.out.print("Enter Text 2 : ");
                String text2 = scanner.nextLine();

                String result = ConcatenateStrings(text1, text2);
                System.out.print("\n"+"Concatenated to " + result);
            } else if(text.equals("Copy")){
                System.out.print("Enter Text 1 : ");
                String text1 = scanner.nextLine();
                String result = CopyStrings(text1);
                System.out.print("\n"+"Copied text : " + result);
            }
            System.out.print("\nEnter Operation ('Compare' | 'Copy' | 'Concatente' | 'Off') : ");
            text = scanner.nextLine();


        }

        scanner.close();


    }

    public static Boolean CompareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static String CopyStrings(String s1){
        return new String(s1);
    }

    public static String ConcatenateStrings(String s1, String s2) {
        return s1+s2;
    }
}
