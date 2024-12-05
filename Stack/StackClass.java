public class StackClass {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    // Push
    public void push(int val) {
        Node node = new Node(val);

        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Can't pop.");
            return -1;
        }

        int top = head.val;
        head = head.next;
        return top;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Can't peek.");
            return -1;
        }

        return head.val;
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
