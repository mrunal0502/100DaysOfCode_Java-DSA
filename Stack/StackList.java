//Stack Implementation using arrayList

import java.util.ArrayList;

public class StackList {
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    // push
    public void push(int item) {
        stack.add(item);
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Can't pop from empty stack");
            return -1;
        }

        int item = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return item;
    }

    // peek

    public int peek() {
        if (isEmpty()) {
            System.out.println("Can't pop from empty stack");
            return -1;
        }

        int item = stack.get(stack.size() - 1);
        return item;
    }

    private boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    public static void main(String[] args) {
        StackClass s = new StackClass();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println();
            System.out.println(s.peek());
            s.pop();
        }
    }
}
