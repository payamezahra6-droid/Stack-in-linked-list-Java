public class Stack {

        Node top;

        Stack() {
            top = null;
        }

        void push(int data) {
            Node newNode = new Node(data);

            newNode.next = top;
            top = newNode;
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            int value = top.data;
            top = top.next;

            return value;
        }

        int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }

            return top.data;
        }

        void display() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = top;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
