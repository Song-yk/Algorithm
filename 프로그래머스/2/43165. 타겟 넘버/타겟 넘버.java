class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, 0, target);
        
        
        return answer;
    }
    
    public void dfs(int [] numbers, int num , int index, int target){
        if(index == numbers.length){
            if(target == num){
                answer++;
            }
            return;
        }
        
        dfs(numbers, num-numbers[index], index+1, target);
        dfs(numbers, num+numbers[index], index+1, target);
        
    }
}