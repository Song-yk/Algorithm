class Solution {
    public int[] solution(long n) {
        
        String str = "";
        
        while(n > 0){
            str +=  Long.toString( n % (long)10 );
            n = n / 10;
        }
        
        
        int[] answer = new int [str.length()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = Integer.parseInt(str.substring(i,i+1));
        }
        
        return answer;
    }
}