import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < progresses.length; i++){
            progresses[i] = 100 - progresses[i];
            int a = progresses[i] / speeds[i];
                
            progresses[i] = progresses[i] % speeds[i] == 0? a : a +1;
            System.out.println(progresses[i]);
        }
        int count = 0;
        for(int i : progresses){
            if(stack.isEmpty()){
                stack.push(i);
                count++;
            }else{
                if(stack.peek() >= i){
                    count++;
                }else{
                    stack.pop();
                    stack.push(count);
                    count = 0;
                    stack.push(i);
                    count++;
                }
            }
        }
        stack.pop();
        stack.push(count);
        
        int[] answer = new int[stack.size()];
        for(int i = stack.size()-1; i >=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}