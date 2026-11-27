public class Question {

    private Category category;
    private String questionText;
    private String[] answers;
    private String correctAnswer;

    public Question(Category category, String questionText, String[] answers, String correctAnswer) {

        this.category = category; // Sport eller Geografi
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public Category getCategory() {

        return category;
    }

    public String getQuestionText() {

        return questionText;

    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {

        return correctAnswer;

    }

    // public boolean isCorrect(int selectedAnswer) {

    // if (selectedAnswer == correctAnswer) {
    // return true;
    // }
    // return false;

    // }

}
