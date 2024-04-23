import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception{

Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 정수 입력 후의 개행 문자 처리

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            boolean isValid = true; // 괄호 쌍이 올바르게 구성되어 있는지를 나타내는 변수

            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            // 스택이 비어 있지 않은 경우에는 올바르지 않은 괄호 쌍
            if (!stack.isEmpty()) {
                isValid = false;
            }

            if (isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
	
		}
	}

}
