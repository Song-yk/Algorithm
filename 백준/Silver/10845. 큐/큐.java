import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		int rear = 0;
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine()); // 한 줄씩 입력 받음 
			String S = st.nextToken();
			
			if(S.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				q.add(num);
				rear = num;
			}else if(S.equals("front")) {
				if(q.isEmpty()) System.out.println(-1);
				else System.out.println(q.peek());
			}else if(S.equals("empty")) {
				if(q.isEmpty()) System.out.println(1);
				else System.out.println(0);
			}else if(S.equals("pop")) {
				if(q.isEmpty()) System.out.println(-1);
				else System.out.println(q.poll());
			}else if(S.equals("size")) {
				System.out.println(q.size());
			}else if(S.equals("back")) {
				if(q.isEmpty()) System.out.println(-1);
				else System.out.println(rear);
			}
			
		}
	}

}
