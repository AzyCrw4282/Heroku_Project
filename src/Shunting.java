 
import java.lang.*;


public class Shunting {
      
    public String shunting(String str) {
      int i;
      Stack stak = new Stack();
      char temp;
      String output="";
      for( i=0; i<str.length();i++) {
        temp=str.charAt(i);
        
        if (Character.isLetterOrDigit(temp)) {
          output+=temp;
        }
        else if (temp=='(') {
          stak.push(temp);
        }
        else if(temp==')') {
          
            while (!stak.isEmpty()&&stak.stackTop()!='(') {
              output+=stak.pop();
            }
        }
        
        
        
        
        
        
      }
      
      
      
      return null;
    }
}
