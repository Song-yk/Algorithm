class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double sqrt = Math.sqrt(n);
        if(Math.floor(sqrt) == sqrt){
            answer = (long)((sqrt+1)*(sqrt+1));
        }
        return answer;
    }
}