package be.qa;

import java.util.ArrayList;
import java.util.List;

import aos.console.AosConsole;

public class QaGame {

    public static void main(String[] args) {
        
        List<QuestionAnswer> questionAnswers= new ArrayList<QuestionAnswer>();
        
        questionAnswers.add(new QuestionAnswer("How are you?","FINE"));
        questionAnswers.add(new QuestionAnswer("ARE YOU GAY?","NO"));
        questionAnswers.add(new QuestionAnswer("DO YOU LIKE MEN?","FUCK OF"));
        questionAnswers.add(new QuestionAnswer("Are you stupid?","Nope"));
        
        Integer marks=0;
        
        for(QuestionAnswer questionAnswer: questionAnswers) {
            
            String givenAnswer= AosConsole.readLine(questionAnswer.getQuestion()+ "?");
            
            if(questionAnswer.isAnswerValid(givenAnswer)) {
                marks++;
            }
        }
        AosConsole.println("Results =" +marks+ "/" + questionAnswers.size());
        
    }

}
