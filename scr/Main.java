import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user, password;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("ID: ");
            user = input.next();
            System.out.print("Password: ");
            password = input.next();
            count++;
            if (count == 3) {
                System.out.println("You have entered the wrong ID and password more than 3 times, goodbye :)");
                System.exit(0);
            }
        }
            while (!user.equals("admin") || !password.equals("123456"));
        int choice = -1;
        int width, height;
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input Height: ");
                    height = input.nextInt();
                    System.out.print("Input Width: ");
                    width = input.nextInt();
                    for (int i = 0; i < height ; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Input Height: ");
                    height = input.nextInt();
                    for (int i = 0; i <= height ; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
//                        System.out.println();
//                        for (int i = height; i >= 1 ; i--) {
//                            for (int j = 1; j <= i; j++) {
//                                System.out.print(" * ");
//                            }
//                            System.out.println();
//                        }
                    break;
                case 3:
                    System.out.print("Input Height: ");
                    height = input.nextInt();
//                        System.out.print("Input Width: ");
//                        width = input.nextInt();
                    for (int i = 0; i < height ; i++) {
                        for (int j = height - i -1; j >= 0 ; j--) {
                            System.out.print("   ");
                        }
                        for (int j = 0; j < 2*i + 1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (choice != 0);
}
}
