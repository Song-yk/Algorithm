import java.util.*;
class Solution {
    static int arr[];
    static ArrayList<Integer>[] list;
    static boolean visited [];
    public int solution(int n, int[][] edge) {
        int answer = 0;
        arr = new int[n+1];
        visited = new boolean[n+1];
        list = new ArrayList[n+1];
        
        for(int i = 0 ; i <= n; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0 ; i<edge.length; i++){
            int a = edge[i][0];
            int b = edge[i][1];
            list[a].add(b);
            list[b].add(a);
        }
        
        BFS(1);
        
        Arrays.sort(arr);
        int max = arr[n];
        
        for(int i = 0; i <= n; i++){
            if(max == arr[i]){
                answer++;
            }
        }
        return answer;
    }
    static void BFS(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int a = q.poll();
            for(int b : list[a]){
                if(visited[b]){
                    continue;
                }
                q.add(b);
                visited[b] = true;
                arr[b] = arr[a] + 1;
            }
        }
        
    }
}