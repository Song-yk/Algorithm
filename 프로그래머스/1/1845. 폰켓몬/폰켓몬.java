import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }
        if( answer > set.size()) answer = set.size();
        return answer;
    }
}