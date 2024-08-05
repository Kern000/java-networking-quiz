
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {

    private ArrayList<Question> questionList = new ArrayList<>();
    private ArrayList<Integer> userAnswers = new ArrayList<>();
    private int score;

    public ArrayList<Question> getQuestionList(){
        return questionList;
    }

    public void addQuestionToList(Question question){
        this.questionList.add(question);
    }

    public void setQuestionList(ArrayList<Question> newQuestionsList){
        this.questionList = newQuestionsList;
    }

    public void displayQuestions(){

        System.out.println();

        for (int i=0; i<questionList.size(); i++){
            Question targetQuestion = questionList.get(i);
            System.out.println("Question " + (i+1) + ": " + targetQuestion.getQuestion() + "?");
            
            for (int j=0; j < targetQuestion.getOptions().size(); j++){
                String targetQuestionOption = targetQuestion.getOptions().get(j);
                System.out.println((j+1) + ". " + targetQuestionOption);
            }

            System.out.println();
            System.out.println("What is your answer?");

            Scanner sc = new Scanner(System.in);    //Scanner base on input

            int answer = 0;
            String input;
            while (answer <= 0 || answer > targetQuestion.getOptions().size()){
                input = sc.nextLine();
                if (Integer.parseInt(input) <= 0 || Integer.parseInt(input) > targetQuestion.getOptions().size()){
                    System.out.println("Enter a valid number from 1 to " + targetQuestion.getOptions().size());
                } else {
                    answer = Integer.parseInt(input);
                }
            }
            
            userAnswers.add(answer);                         //
            System.out.println("You answered: " + targetQuestion.getOptions().get(answer-1));
            System.out.println("Correct Answer: " + targetQuestion.getAnswer());
            if (targetQuestion.getOptions().get(answer-1).equals(targetQuestion.getAnswer())){
                System.out.println("You got the correct answer!");
                score++;
            } else {
                System.out.println("Sorry, you got the wrong answer :'");
            }
            System.out.println();
        }

        System.out.println("You got " + score + " out of " + userAnswers.size() + " questions correct.");
    }


}