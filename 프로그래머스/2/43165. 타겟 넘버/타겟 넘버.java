class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(0, numbers, 0, target);
        return answer;
    }
    
    public void dfs( int num, int [] numbers , int index, int target){
        if(index == numbers.length){
            if(num == target){
                answer++;
            }
            return;
        }
     
        dfs(num + numbers[index], numbers, index + 1, target);
        dfs(num - numbers[index], numbers, index + 1, target);
        return;
    }
}