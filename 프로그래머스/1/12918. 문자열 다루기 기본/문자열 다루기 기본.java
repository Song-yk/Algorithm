class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String [] str = s.split("");

        
        for(String st : str){
            answer = false;
            for(int i = 0; i < 10; i++){
                if(st.equals(Integer.toString(i)))
                    answer = true;
            }
            
            if(answer == false)  break;
        }
    
        if (!(s.length() == 4 || s.length() == 6)) {
            answer = false; 
        }
        return answer;
    }
}