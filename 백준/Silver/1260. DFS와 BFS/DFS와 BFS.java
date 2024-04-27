import java.util.*;

public class Main {

	static boolean [] visited;
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();
		
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i = 1; i<= N; i ++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i = 1; i <=N; i++) {
			Collections.sort(A[i]);
		}
		
		DFS(start);
		System.out.println();
		
		visited = new boolean[N+1];
		BFS(start);
		System.out.println();
		
	}
	private static void BFS(int Node) {
		Queue<Integer> q = new LinkedList<>();
		q.add(Node);
		visited[Node] = true;
		
		while(!q.isEmpty()) {
			int now_Node = q.poll();
			System.out.print(now_Node +" ");
			for(int i : A[now_Node]) {
				if(!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
		
		
	}
	private static void DFS(int Node) {
		System.out.print(Node + " ");
		
		visited[Node] = true;
		
		for(int i : A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
		
	}
}
