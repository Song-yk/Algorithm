import java.util.*;


class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String st [] = str.split("");
        
        ArrayList<String> list = new ArrayList(Arrays.asList(st));
        
        Collections.sort(list,Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String i : list){
            sb.append(i);
        }
        answer =  Long.parseLong(sb.toString());
        return answer;
    }
}