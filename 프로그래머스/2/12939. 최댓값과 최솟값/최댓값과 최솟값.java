class Solution {
    public String solution(String s) {
        String answer = "";
        String [] str = s.split(" ");
        int min = 10000000;
        int max = -10000000;
        for(int i = 0; i < str.length; i++){
            if(min > Integer.parseInt(str[i])) min = Integer.parseInt(str[i]);
            if(max < Integer.parseInt(str[i])) max = Integer.parseInt(str[i]);
        }
        answer += Integer.toString(min) + " ";
        answer += Integer.toString(max);
        return answer;
    }
}