import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Integer [] BInteger = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(BInteger, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            answer += A[i] *BInteger[i];
        }
        
        return answer;
    }
}