import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String strA = sc.next();
		String strB = sc.next();
		
		String [] sA = strA.split("");
		String [] sB = strB.split("");
		
		long answer = 0;
		for(int i = 0 ; i < sA.length; i++) {
			for(int j = 0; j <sB.length; j++) {
				answer = answer + Integer.parseInt(sA[i]) * Integer.parseInt(sB[j]);
			}
		}
		
		System.out.println(answer);
	
	}
}
