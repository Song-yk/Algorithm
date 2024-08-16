import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        Arrays.sort(arr);
        
        int num = 0;
        for(int i : arr){
            if( i % divisor == 0){
                num ++;
            }
        }
        
        int[] answer = new int [num];
    
        int index = 0;
        for(int i : arr){
            if( i % divisor == 0){
                answer[index] = i;
                index++;
            }
        }
        if(answer.length == 0)
        answer = new int [] {-1};
        return answer;
    }
}