import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		
		for(int i = 0 ; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!mydeque.isEmpty() && mydeque.getLast().value>now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now,i));
			
			if(mydeque.getFirst().index <= i -L) {
				mydeque.removeFirst();
			}
			
			bw.write(mydeque.getFirst().value +" ");
		}
		
		bw.flush();
		bw.close();
		
	}

	static class Node{
		public int value;
		public int index;
		
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}
}
