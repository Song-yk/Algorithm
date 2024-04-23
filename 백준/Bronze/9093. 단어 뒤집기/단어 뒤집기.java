
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());

		for(int i = 0; i < n; i++) {
			Stack<Character> stack = new Stack<>();
			String str = bf.readLine()+'\n';
			
			for(char ch : str.toCharArray()) {
				if(ch == ' ' || ch =='\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(ch);
				}else {
					stack.push(ch);
				}
			}
							
		}
		bw.flush();
	}

}
