import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== JAVA QUIZ APPLICATION =====");

        // Question 1
        System.out.println("\n1. Which keyword is used to create a class in Java?");
        System.out.println("A. class");
        System.out.println("B. define");
        System.out.println("C. create");
        System.out.println("D. object");

        System.out.print("Your answer: ");
        String answer1 = sc.nextLine();

        if (answer1.equalsIgnoreCase("A")) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. init()");

        System.out.print("Your answer: ");
        String answer2 = sc.nextLine();

        if (answer2.equalsIgnoreCase("C")) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which package contains Scanner class?");
        System.out.println("A. java.io");
        System.out.println("B. java.util");
        System.out.println("C. java.lang");
        System.out.println("D. java.net");

        System.out.print("Your answer: ");
        String answer3 = sc.nextLine();

        if (answer3.equalsIgnoreCase("B")) {
            score++;
        }

        // Result
        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}