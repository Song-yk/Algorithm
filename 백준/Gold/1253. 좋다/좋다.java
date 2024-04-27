import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws Exception{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int count = 0;
		long A [] = new long [N];
		
		//A[i] + A[j] > K; j--;
		//A[i] + A[j] < K; i++;
		//A[i] + A[j] == K; i++, j--, count++;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		for(int k = 0 ; k < N; k++) {
			int i = 0;
			int j = N-1;
			
			while(i < j) {
			
				if(A[i]+ A[j] == A[k]) {
					if(i != k && j != k) {
						count++;
						break;
					}else if(i ==k) {
						i++;
					}else if(j ==k) {
						j--;
					}
				}else if( A[i] + A[j]< A[k]) {
					i++;
				}else {
					j--;
				}
			}
			
		}
		
		System.out.println(count);
		bf.close();
		
	}

}
