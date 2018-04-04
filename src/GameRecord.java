



public class GameRecord{
    private String name;
    private int correct=0;
    private int incorrect=0;
    private int score=0;
    private int totalQuestion = 6;
    

    public void setScore(int s){
        
        this.score = s;
        
    }
    public void setQuestions(int q){
        
        this.totalQuestion = q;
    }
    
    public int getQuestions(){
        
        return this.totalQuestion;
    }
  
    public int getScore(){
        
        return this.score;
    }
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCorrect() {
        return correct;
    }
    
    

    public void CorrectAns() {
      
        ++this.score;
        --this.totalQuestion;
       
    }

    public int getIncorrect() {
        return incorrect;
    }
    
    public void reset(){
        
        this.correct = 0;
        this.incorrect = 0;
        this.score = 0;
        
    }

    public void IncorrectAns() {
      
        --this.totalQuestion;
    }

  @Override
  public String toString(){
      
      return this.name +" " + this.score;
  }
}
