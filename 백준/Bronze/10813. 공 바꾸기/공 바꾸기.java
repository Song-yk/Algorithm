import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] K = new int[N];
		
		for(int i = 0 ; i <N; i++) {
				K[i] = i + 1;
		}
		
		for(int Q = 0; Q < M; Q++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			
			int temp = 0;
			
			temp = K[j];
			K[j] = K[i];
			K[i] = temp;
		}
		
	
		String answer = "";
		
		for(int i = 0 ; i < N; i ++) {
			answer += K[i];
			answer += " ";
		}
		
		System.out.println(answer.trim());
		
	}
}
