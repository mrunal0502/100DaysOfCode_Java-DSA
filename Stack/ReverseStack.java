import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println();
            System.out.println(s.peek());
            s.pop();
        }
    }

    private static void reverse(Stack<Integer> s) {
        // TODO Auto-generated method stub
        if (s.empty()) {
            return;
        }
        int temp = s.pop();
        reverse(s);
        pushAtBottom(s, temp);
    }

    private static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.empty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
}
