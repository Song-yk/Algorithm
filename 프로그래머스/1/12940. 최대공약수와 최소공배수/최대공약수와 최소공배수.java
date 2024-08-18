class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int gcdValue = gcd(n,m);
        int lcm = Math.abs((n * m) / gcdValue);
        
        answer[0] = gcdValue;
        answer[1] = lcm;
        return answer;
    }
    
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return(gcd(b, a % b));
        }
    }
}