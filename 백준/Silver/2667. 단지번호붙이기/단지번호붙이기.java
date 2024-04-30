import java.util.*;
import java.io.*;

public class Main {

    static int[][] A;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N;
    static int count = 0;

    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        A = new int [N][N];
        visited = new boolean [N][N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }

        for(int i = 0 ; i < N; i++) {
            for(int j = 0 ; j < N; j++) {
                if(!visited[i][j] && A[i][j] == 1) {
                	count++;
                    DFS(i,j);
                }
            }
        }

        int[] danjiSizes = new int[count];
        for(int i = 0 ; i < N; i ++) {
            for(int j = 0 ; j < N; j++) {
                if(A[i][j] != 0) {
                    danjiSizes[A[i][j]-1]++;
                }
            }
        }

        Arrays.sort(danjiSizes);

        System.out.println(count);
        for(int i = 0 ; i < count; i++) {
            System.out.println(danjiSizes[i]);
        }
    }

    private static void DFS(int i, int j) {
        visited[i][j] = true;
        A[i][j] = count;
        for(int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && y >= 0 && x < N && y < N && !visited[x][y] && A[x][y] == 1) {
                DFS(x, y);
            }
        }
    }

}
