package lab_03;
import java.util.Scanner;
class StringHandler {
    public static void main(String[] args) {
//        Write a program in Java for String handling which performs the following:
//        i. Checks the capacity of String Buffer objects.
//        ii. Reverses the contents of string given on console and converts the resultant string in upper
//        case.
//        iii. Reads a string from console and appends it to the resultant string.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        StrBuffer(str);

        StringReverser(str);

        System.out.print("Enter another string: ");
        String str1 = scanner.nextLine();

        StringAppender(str,str1);

        scanner.close();


    }

    public static void StrBuffer(String s1){
        StringBuffer sb = new StringBuffer(s1);
        System.out.println("String Buffer of "+s1 + " is "+ sb.capacity());
    }

    public static void StringReverser(String s1){
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        System.out.println("String Reverser of "+s1 + " is "+ sb.toString().toUpperCase());
    }

    public static void StringAppender(String s1, String s2){
        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2);
        System.out.println("String Appender of "+s1 + " is "+ sb.toString());
    }
}
