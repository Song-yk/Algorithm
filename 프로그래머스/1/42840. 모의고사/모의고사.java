import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        // 1번 수포자는 1, 2, 3, 4, 5
        //Stack<Integer> stack1 = new Stack<>();
        int[] num1 = {1, 2, 3, 4, 5};
        // for (int i : num1) {
        //     stack1.push(i);
        // }
        
        // 2번 수포자는 2, 1, 2, 3, 2, 4, 2, 5
        //Stack<Integer> stack2 = new Stack<>();
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        // for (int i : num2) {
        //     stack2.push(i);
        // }
        
        // 3번 수포자는 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        //Stack<Integer> stack3 = new Stack<>();
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//         for (int i : num3) {
//             stack3.push(i);
//         }
        
//         //스택을 3개 만들어서 pop과 push를 반복하여 정답배열의 수와 같에 만들어준다.
//         for(int i = 0; i < answers.length - num1.length-1; i++){
//             stack1.push(stack1.pop());
//         }
        
//         for(int i = 0; i < answers.length - num2.length-1; i++){
//             stack2.push(stack2.pop());
//         }
        
//         for(int i = 0; i < answers.length - num3.length-1; i++){
//             stack3.push(stack3.pop());
//         }
        
          // answers배열과 각 스택 값을 비교하면서 같은 경우 count 를 증가시켜준다.
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        // 각 수포자의 답안 패턴과 비교하여 정답 개수 측정
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % num1.length]) count1++;
            if (answers[i] == num2[i % num2.length]) count2++;
            if (answers[i] == num3[i % num3.length]) count3++;
        }
        
        

        
//         for (int i = 0; i < answers.length; i++) {
//             if (!stack1.isEmpty() && i == stack1.pop()) count1++;
//             if (!stack2.isEmpty() && i == stack2.pop()) count2++;
//             if (!stack3.isEmpty() && i == stack3.pop()) count3++;
//         }
        
        //count 중 최대 값을 찾아 answer배열에 넣어준다. 결과는 오름차순으로 출력
        int maxCount = Math.max(count1, Math.max(count2, count3));
        List<Integer> resultList = new ArrayList<>();
        
        if (count1 == maxCount) resultList.add(1);
        if (count2 == maxCount) resultList.add(2);
        if (count3 == maxCount) resultList.add(3);
        
        // 결과를 배열로 변환
        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}
