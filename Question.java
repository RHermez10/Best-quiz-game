
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

    public boolean isCorrect(int selectedAnswer) {

        if (selectedAnswer == correctAnswer){
            return true;
        }
            return false;
        
    }

}
