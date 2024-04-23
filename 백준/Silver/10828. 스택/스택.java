import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String S = st.nextToken();
			if(S.equals("top")) {
				if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
			}else if(S.equals("pop")) {
				if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
			}else if(S.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
					
			}else if(S.equals("size")) {
				System.out.println(stack.size());
			}else if(S.equals("push")) {
				int c = Integer.parseInt(st.nextToken());
				stack.push(c);		}
				
	}
		
	}

}
