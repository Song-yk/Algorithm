class Solution {
    public static int answer = 0;
    public static boolean visited [];    
    public int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                answer++;
                dfs(i, computers);
                
            }
        }
        
        return answer;
    }
    
    public void dfs(int Node, int [][] computers){
        if(visited[Node]){
            return;
        }
        
        visited[Node] = true;
        
        for(int i = 0 ; i < computers.length; i++){
            if(!visited[i] && computers[Node][i] == 1){
                dfs(i, computers);
            }
        }
        
        return;
    }
}