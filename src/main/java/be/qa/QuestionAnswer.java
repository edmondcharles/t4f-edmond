package be.qa;

public class QuestionAnswer {
    
    private String question;
    private String answer;
    
    public QuestionAnswer(String question, String answer){
        super();
        this.question= question;
        this.answer= answer;
        
    }
    
    public String getQuestion(){
        return this.question;
        
    }
    public Boolean isAnswerValid(String givenAnswer){
        return givenAnswer.equalsIgnoreCase(this.answer);
    }

}
