class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tlength = t.length();
        int plength = p.length();
        
        for(int i = 0 ; i < tlength; i++){
            if(i+plength <= tlength){
                String a =  t.substring(i, i+plength);
                if(Long.parseLong(a) <= Long.parseLong(p)){
                    answer++;
                }
            }
        }
        return answer;
    }
}