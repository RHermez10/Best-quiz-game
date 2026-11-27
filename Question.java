
public class Question {

    private String category;
    private String questionText;
    private String[] answers;
    private int correctAnswer;

    
    public Question(String category, String questionText, String[] answers, int correctAnswer) {

        this.category = category; // Sport eller Geografi
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    
    public String getCategory() {
        
        return category;
    }

    public String getQuestionText() {

        return questionText;

    }

    public String[] getAnswers() {

        return answers;

    }

    public int getCorrectAnswer() {

        return correctAnswer;

    }

    // Check answer
    public boolean isCorrect(int selectedAnswer) {

        if (selectedAnswer == correctAnswer){
            return true;
        }
            return false;
        
    }

    
    public static Question[] getAllQuestions() {

        return new Question[] {

            

            new Question("Sport",
                "Vem van VM 2026?",
                new String[]{"Argentina", "Spanien", "Brazil"}, 2),

            new Question("Sport",
                "Vilket landslag spelar Messi?",
                new String[]{"France", "Argentina", "Brazil"}, 2),

            new Question("Sport",
                "I vilken sport använder man en puck?",
                new String[]{"Tennis", "Basketball", "Ishockey"}, 3),

           

            // GEOGRAPHY 

            new Question("Geography",
                "Vad heter huvudstaden i Australien?",
                new String[]{"Sydney", "Canberra", "Perth"}, 3),

            new Question("Geography",
                "Vilket är världen största land till ytan?",
                new String[]{"USA", "Russia", "Kina"}, 2),

            new Question("Geography",
                "Which country has the largest population?",
                new String[]{"India", "USA", "Russia", "Japan"}, 0),

    

            new Question("Geography",
                "Vilken flod är längst i världen enligt den vanligaste geografiska mättningen?",
                new String[]{"Amazonas", "Nilen", "Mississippi"}, 2)
        };
    }
}
