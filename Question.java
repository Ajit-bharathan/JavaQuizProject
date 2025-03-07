package CoreJavaQuizProject2;

public class Question {

    int id;
    String question;
    String []options;
    String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer)
    {
        this.id=id;
        this.question=question;
        this.options=new String[]{opt1,opt2,opt3,opt4};
        this.answer=answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

   

    
}
