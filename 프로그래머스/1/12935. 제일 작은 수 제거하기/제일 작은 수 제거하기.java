import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int[] answer = new int [arr.length-1];    
        int[] init = new int [arr.length];
        
        for(int i = 0 ; i < arr.length; i++){
            init[i] = arr[i];
        }
        
        Arrays.sort(arr);
        int index = 0;
        for(int i = 0; i < init.length; i++){
            if(init[i] != arr[0]){
                answer[index++] = init[i];    
            }  
        }
        
        if(arr.length -1 == 0)
        answer = new int [] {-1};
        
        return answer;
    }
}