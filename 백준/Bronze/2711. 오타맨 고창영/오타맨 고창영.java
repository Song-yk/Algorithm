import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N; i++) {
			int num = sc.nextInt() -1;
			String S = sc.next();
		
			String[] str = S.split("");
			String answer = "";
			for(int j = 0; j < str.length; j++) {
				if(j != num) {
					answer += str[j];
				}
			}
			System.out.println(answer);
		}

	}

}
