class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];
        if(yellow == 1){
            answer[0] = 1+2;
            answer[1] = 1+2;
            return answer;
        }
        int yak = 0;
        
        for(int i = 2; i <=yellow; i++){
            if(yellow % i == 0 &&  i >= yellow / i){
                yak = i;
                break;
            }
        }
        System.out.println(yak);
        for(int i = yak ; i <= yellow ; i ++){
            if(yellow % i == 0){
                System.out.println(i);
                System.out.println(yellow/i);
                  int x = i + 2;
                  int y = (yellow / i) + 2;
                  if(x * y - yellow == brown){
                     answer[0] = x;
                     answer[1] = y;
                      
                     break;
                }
            }
        }
        return answer;
    }
}