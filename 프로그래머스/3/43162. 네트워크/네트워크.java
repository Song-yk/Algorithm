class Solution {
    public static boolean visited [];
    public static int answer = 0;
    public int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        
        for(int i = 0 ; i < computers.length; i++){
            if(!visited[i]){
                answer++;
                DFS(i, computers);
            }
        }
        return answer;
    }
    
    public void DFS(int Node , int[][] computers){
        if(visited[Node]){
            return;
        }
        
        visited[Node] = true;
        
        for(int i = 0 ; i < computers.length; i++){
            if(!visited[i] && computers[Node][i] == 1){
                DFS(i, computers);
            }
        }
    }
}