package Map2;

import java.util.*;
public class Test{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          isbalanced(input);
      }
      
   }
    static void isbalanced(String s){
    	int open=0;
    	int close=0;
        char arr[] = s.toCharArray();
        for(char c:arr){
        	if(c=='('||c=='['||c=='{'){open++;}
        	if(c==')'||c==']'||c=='}'){close++;}
        }
        if(open==close){System.out.println("true");}
        else{System.out.println("false");}
    }
}