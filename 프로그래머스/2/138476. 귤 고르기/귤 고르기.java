import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count [] = new int [100000000];
        for(int i = 0; i < tangerine.length; i++){
            count[tangerine[i]]++;
        }
        Arrays.sort(count);
        int max = 0;
        for(int i = count.length-1; i >=0; i--){
           max += count[i];
           answer++;
           if(max>=k){
               break;
           }
        }
        return answer;
    }
}