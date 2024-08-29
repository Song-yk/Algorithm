import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        //점프 하면 건전지 사용함
        //순간이동하면 점프 * 2의 위치로 가게 됨
        //점프 횟수 출력        
        while(n > 0){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = n -1;
                ans++;
            }
        }
        //2진수 수학 공식으로 다시 풀기 n을 2로 나누다가 홀수 되면 1을 빼 0이될때까지
        
        return ans;
    }
}