class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int sum = 0;
        
        for(int z = 0 ; z < number.length-2; z++){
            for(int i = 1 + z; i < number.length-1; i++){
                for(int j = i +1; j <number.length; j++){
                    sum = number[z] + number[i] + number[j];
                    if(sum == 0) answer++;
                    
                }
            }
    }
        
        return answer;
    }
}