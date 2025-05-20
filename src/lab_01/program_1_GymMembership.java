package lab_01;

import java.util.Scanner;
class GymMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Gold's Gym");

        System.out.println("Enter Name :");
        String name = scanner.nextLine();

        System.out.println("Enter Age : ");
        Integer age = scanner.nextInt();

        System.out.println("Enter Membership Status:");
        Boolean status = scanner.nextBoolean();

        System.out.println("Enter Membership Duration:");
        Integer duration = scanner.nextInt();

        displayDetails(name,age,status, duration, 500);
    }

    public static void displayDetails(String name, Integer age, Boolean status, Integer duration, Integer std_price){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Status : " + status);
        if(status == true){
            System.out.println("Duration : " + duration);
            System.out.println("Final Bill : " + std_price*duration);
        } else {
            System.out.println("Renew membership!");
        }

    }

}
