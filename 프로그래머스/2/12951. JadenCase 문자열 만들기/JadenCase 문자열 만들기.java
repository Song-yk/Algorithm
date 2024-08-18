import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char [] str = s.toCharArray();
        
        if(!Character.isDigit(str[0])){
          answer += Character.toUpperCase(str[0]);   
        }else{
          answer += str[0];  
        }
        for(int i = 1; i < str.length; i++){
            if(str[i-1] == ' '){
                answer += Character.toUpperCase(str[i]);    
            }else{
                answer += Character.toLowerCase(str[i]);
            }
        }
        return answer;
    }
}