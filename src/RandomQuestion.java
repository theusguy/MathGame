


import java.util.Random;


public class RandomQuestion {
    private static final int MIN = 1;
    private static final int MAX = 99;
    private Random random = new Random();
    private char[] operaters={'-','+','/','*'};
    private static RandomQuestion rq = new RandomQuestion();
   public static RandomQuestion getrandom(){
           
          
          return rq;
    }
    
    public int getNum1(){
        
       return random.nextInt(MAX - MIN + 1) + MIN;
        
    }
    
    public int getNum2(){
        
       return random.nextInt(MAX - MIN + 1) + MIN;
        
    }
    
    public char getOperator(){
        
        return operaters[random.nextInt(4)];
    }
    
}
