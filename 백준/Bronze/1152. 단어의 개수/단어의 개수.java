
import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		if(S.replace(" ", "").equals("")) {
		
			System.out.println(0);
			
			return;
		}
		String [] str = S.trim().split(" ");
		
		
		System.out.println(str.length);
		
		}

}
