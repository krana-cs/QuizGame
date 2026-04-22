package QuizGame;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to Java Quiz!");

        // Question 1
        System.out.println("1. Which language is used for Android development?");
        System.out.println("a) Python  b) Java  c) C++  d) HTML");
        String ans1 = sc.next();

        if (ans1.equalsIgnoreCase("b")) {
            score++;
        }

        // Question 2
        System.out.println("2. What is the size of int in Java?");
        System.out.println("a) 2 bytes  b) 4 bytes  c) 8 bytes  d) Depends");
        String ans2 = sc.next();

        if (ans2.equalsIgnoreCase("b")) {
            score++;
        }

        // Question 3
        System.out.println("3. Which keyword is used to create a class?");
        System.out.println("a) function  b) define  c) class  d) new");
        String ans3 = sc.next();

        if (ans3.equalsIgnoreCase("c")) {
            score++;
        }

        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}