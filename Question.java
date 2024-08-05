import java.util.ArrayList;

public class Question {
    
    private int id;
    private String question;
    private ArrayList<String> options = new ArrayList<String>();
    private String answer;

    public Question(int id, String question, ArrayList<String> options, String answer){
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getQuestion(){
        return question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public ArrayList<String> getOptions(){
        return options;
    }

    public void setOptions(ArrayList<String> newOptionsArrayList){
        options = newOptionsArrayList;
    }

    public void addOption(String newOption){
        options.set(options.size(), newOption);
    }

    public void deleteOption(int optionIndex){
        if (optionIndex >= 0){
            options.remove(optionIndex);
        } else {
            options.remove(0);
        }
    }
    
    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String newAnswer){
        this.answer = newAnswer;
    }

}
