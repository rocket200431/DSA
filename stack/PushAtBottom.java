import java.util.*;

public class PushAtBottom {

    // Function to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: If stack is empty, push the data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Recursive step: Pop the top element and process the rest
        int top = s.pop();
        pushAtBottom(s, data);

        // After recursion, push the top element back
        s.push(top);
    }

    // Function to print the stack
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Push 0 at the bottom of the stack
        pushAtBottom(s, 0);

        // Print the stack
        printStack(s);
    }
}
