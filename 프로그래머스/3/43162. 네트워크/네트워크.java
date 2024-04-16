class Solution {
    static boolean visited[];
    static int answer = 0;
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
    static void DFS(int node, int [][] computers){
        if(visited[node]){
            return;
        }
        visited[node] = true;
        for(int i = 0 ; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                DFS(i, computers);
            }
        }
    }
}