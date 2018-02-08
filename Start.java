import java.util.Scanner;

import static java.lang.System.exit;

public class Start {

    public static void main(String[] args) {

        String option;
        System.out.println("Enter task number 1, 2, or q to quit:");
        Scanner sn = new Scanner(System.in);
        while(sn.hasNext()) {
            option = sn.next();
            switch (option) {
                case "1":
                    System.out.println("Start task 1:");
                    TaskOne task1 = new TaskOne();
                    System.out.println("Enter string:");
                    Scanner sn1 = new Scanner(System.in);
                    task1.checkString(sn1.nextLine());
                    System.out.println("Enter task number:");
                    break;
                case "2":
                    System.out.println("Start task 2:");
                    TaskTwo task2 = new TaskTwo();
                    System.out.println("Enter numeric string:");
                    Scanner sn2 = new Scanner(System.in);
                    task2.parseString(sn2.nextLong());
                    System.out.println("Enter task number:");
                    break;
                case "q":
                    System.out.println("end");
                    exit(0);
                    break;
                default:
                    System.out.println("You are wrong! Enter true symbol");
                    break;
            }
        }
    }
}
