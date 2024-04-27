import java.util.*;

public class Main {
	static int answer = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] str = s.split("-");
		for(int i = 0 ; i < str.length; i++) {
			if(i==0) {
				answer += mysum(str[i]);	
			}else {
				answer-=mysum(str[i]);
			}
				
		}
		
		System.out.println(answer);
	}
	
	static int mysum(String a) {
		int sum = 0;
		
		String [] temp = a.split("[+]");
		
		for(int i = 0 ; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		
		return sum;
		
	}

}
