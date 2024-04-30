import java.util.*;

public class Main {
static ArrayList<Integer> A [];
static boolean visited [];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i = 0 ; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			A[s].add(e);
			A[e].add(s);
		}
		
		DFS(1);
		
		int answer = 0;
		
		for(int i = 0 ; i <= N; i++) {
			if(visited[i]) answer++;
		}
		
		System.out.println(answer -1 );
	}
	
	static void DFS(int i) {
		visited[i] = true;
		
		for(int j : A[i]) {
			if(!visited[j]) {
				visited[j] = true;
				
				DFS(j);
			}
		}
	}

}
