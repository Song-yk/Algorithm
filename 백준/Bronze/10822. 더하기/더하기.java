import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String [] str = S.split(",");
		int answer = 0;
		for(int i = 0 ;  i < str.length; i++) {
			answer += Integer.valueOf(str[i]);
		}
		
		System.out.println(answer);
		
		
	}

}
