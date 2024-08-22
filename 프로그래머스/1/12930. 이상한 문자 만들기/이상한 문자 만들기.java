class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split("");
        int index = 0;
        
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ")){
                index = 0;
                answer += " ";
            }else{
                if(index % 2 == 0){
                    answer += str[i].toUpperCase();
                }else{
                    answer += str[i].toLowerCase();
                }
                index ++ ;
            }
        }
        
        
        return answer;
    }
}