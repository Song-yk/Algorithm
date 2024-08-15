class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String str [] = s.split("");
        int count = 0;
        
        for(String i : str){
            if(i.equals("p") ||i.equals("P")){
                count ++;
            }else if(i.equals("y") ||i.equals("Y")){
                count --;
            }
        }
        
        if(count != 0 ) answer = false;

        return answer;
    }
}