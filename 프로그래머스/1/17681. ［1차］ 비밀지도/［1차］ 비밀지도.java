class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        int [] count = new int [n];
        for(int i = 0; i < n; i++){
           String a = Integer.toBinaryString(arr1[i] | arr2[i]);
           if(a.length() < n){
               String b = "";
               for(int j = 0; j < n - a.length(); j ++){
                   b += "0";
               }
               b += a;
               System.out.println(b);
               a = b;
           }
           a = a.replace("1","#");
           a = a.replace("0"," "); 
           answer[i] = a;
        }
        
        
        return answer;
    }
}