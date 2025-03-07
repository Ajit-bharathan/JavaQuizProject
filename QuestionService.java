package CoreJavaQuizProject2;

import java.util.Scanner;

public class QuestionService {

    Question []questions= new Question[5];
    // String []options= new String [4];
    String []options;
    String []selection= new String[5];

    public QuestionService()
    {
        questions[0]=new Question(1, " Size of int ?", "2", "3", "4", "5", "4");
        questions[1]=new Question(2, " Size of float ?", "2", "3", "4", "5", "4");
        questions[2]=new Question(3, " Size of char ?", "1", "3", "4", "5", "1");
        questions[3]=new Question(4, " Size of double ?", "2", "3", "8", "5", "8");
        questions[4]=new Question(5, " Size of String ?", "2", "3", "4", "5", "4");
    }

    public void quiz()
    {
        int j=0;
        for(Question que: questions)
        {
            System.out.println(" Question no: " + que.getId());
            System.out.println(que.getQuestion());
            options= que.getOptions();
            for(int i=0;i<options.length;i++)
            {
                System.out.println(i+1 +". "+options[i]);

            }

            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter your choice: (1-4)");
            int choice = sc.nextInt();
            selection[j]= (choice>=1 && choice<=4)?options[choice-1]:"Incorrect input";
            j++;
        }
        
        for(String s : selection)
        {
            System.out.println(" Your selections are " + s);
        }

        
    }

    public void printScore()
    {
        int score=0;

        for(int i=0;i<questions.length;i++)
        {
            Question que= questions[i];

            String actualAnswer= que.getAnswer();
            String userAnswer= selection[i];
            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }

        }
       

        System.out.println(" Your score is : " + score);
        
    }


    
    
}
