package CoreJavaQuizProject2;


 
public class Main {
    public static void main(String[] args) {

        QuestionService service= new QuestionService();

        service.quiz();
        service.printScore();
	System.out.println("Thankyou");

        
    }
    
}
