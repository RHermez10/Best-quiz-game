import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Question[] sport = {
                new Question(Category.SPORT, "Vilket land vann VM 2026?",
                        new String[] { "Argentina", "Spanien", "Brasilien" }, "Spanien"),

                new Question(Category.SPORT, "Vilket landslag spelar Messi?",
                        new String[] { "Sverige", "Italien", "Argnetina" }, "Argentina"),

                new Question(Category.SPORT, "I vilken sport använder man en puck?",
                        new String[] { "Handboll", "Tennis", "Ishockey" }, "Ishockey")
        };

        Question[] geography = {
                new Question(Category.GEOGRAPHY, "Vilket är världens största land till ytan?",
                        new String[] { "Ryssland", "Kina", "USA" }, "Ryssland"),

                new Question(Category.GEOGRAPHY, "Vad heter huvudstaden i Australien?",
                        new String[] { "Sydney", "Canberra", "Perth" }, "Canberra"),

                new Question(Category.GEOGRAPHY,
                        "Vilken flod är längst i världen enligt det vanligaste geografiska mättningen?",
                        new String[] { "Nilen", "Amazonas", "Mississipippi" }, "Nilen")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz game!\n");
        System.out.println(
                "You will get to choose between a specific category or choose all categories.\nIn each category you will get 3 multiple-choice questions. Each question has 3 alternatives; only 1 of them is correct.\nAnswer by typing 1,2 or 3.\nIf your answer is correct you will get 1 point. The goal is to collect as many points as you can.");

        System.out.println("Enter your name to get started!");

        Player player = new Player(scanner.nextLine());

        System.out.println("Welcome " + player.getName() + " Choose a category or play all categories.");

        System.out.println("1. Sport");
        System.out.println("2. Geography");
        System.out.println("3. Both categories");

        int choosenCategory = scanner.nextInt();

        switch (choosenCategory) {
            case 1:
                for (Question sportQuestion : sport) {
                    System.out.println(sportQuestion.getQuestionText());
                    for (int i = 0; i < sportQuestion.getAnswers().length; i++) {
                        System.out.println((i + 1) + " " + sportQuestion.getAnswers()[i]);
                    }
                    int playersAnswer = scanner.nextInt();
                }

                break;
            case 2:
                for (Question geographyQuestion : geography) {

                    System.out.println(geographyQuestion.getQuestionText());
                }
                break;
            case 3:
                break;
            default:
                ;
        }

        // När spelet är slut visa resultat
        System.out.println("Game finished");
        System.out.println("Result: " + "name: ");
        System.out.println("points: " + "" + "total correct answers ");
    }

}
