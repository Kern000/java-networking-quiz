import java.util.ArrayList;

public class QuestionService {

    private ArrayList<Question> questionList = new ArrayList<Question>();


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
        }
    }


}