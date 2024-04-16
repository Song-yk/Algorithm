import java.util.*;

class Solution {
    static boolean [][] visited;
    static int [] dx = {0, 1, 0, -1};
    static int [] dy = {1, 0, -1, 0};
    static int N, M;
    static int answer = -1;
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        visited = new boolean[N][M];
        
        BFS(0, 0, maps);
        return answer;
    }
    public static void BFS(int i, int j, int [][] maps){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        visited[i][j] = true;
            while(!queue.isEmpty()){
                int now [] = queue.poll();

                if (now[0] == N-1 && now[1] == M-1 ) {
                    answer = maps[N-1][M-1];
                    return;
                }
                for(int k = 0; k <4; k++){
                    int x = now[0] + dx[k];
                    int y = now[1] + dy[k];
                    if(x >= 0 && y >= 0 && x< N && y< M ){
                        if(maps[x][y] !=0 && !visited[x][y]){
                            visited[x][y] = true;
                            maps[x][y] = maps[now[0]][now[1]] + 1;
                            queue.add(new int[]{x,y});
                        }
                    }
                }
            }
    }
}