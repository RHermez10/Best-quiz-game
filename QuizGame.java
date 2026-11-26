import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz game!\n");
        System.out.println(
                "You will get to choose between a specific category or choose all categories.\nIn each category you will get 3 multiple-choice questions. Each question has 3 alternatives; only 1 of them is correct.\nAnswer by typing a,b or c.\nIf your answer is correct you will get 1 point. The goal is to collect as many points as you can.");

        System.out.println("Enter your name to get started!");
        String name = scanner.nextLine();

        System.out.println("Welcome Marta! Choose a category or play all categories.");

        System.out.println("1. Sport");
        System.out.println("2. Geography");
        System.out.println("3. Both categories");

    }

}
