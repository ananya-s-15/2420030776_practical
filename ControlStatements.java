package scannerexa;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Pos");
        } else if (n<0) {
            System.out.println("Neg");
        } else {
            System.out.println("Zero");
        }

        
        
        System.out.print("Enter day number (1-3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tues"); break;
            case 3: System.out.println("Wed"); break;
            default: System.out.println("Invalid day");
        }

        // FOR LOOP
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        
        System.out.println("While loop countdown:");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
       
        System.out.println();

        
        System.out.println("Do-while loop example:");
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 3);

        sc.close();
    }
}
