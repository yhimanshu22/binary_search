import java.util.*;

public class sort_stack {

    public Stack<Integer> sort_stack(Stack<Integer> stack) {

        Stack<Integer> sortedStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                stack.push(sortedStack.pop());
            }

            sortedStack.push(temp);
        }

        return sortedStack;
    }

    public static void main(String[] args) {
        sort_stack sorter = new sort_stack(); // Create an instance of sort_stack

        Stack<Integer> stack = new Stack<>(); // Create a new stack

        // Push some integers onto the stack
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        // Sort the stack
        Stack<Integer> sortedStack = sorter.sort_stack(stack);

        System.out.println("Sorted Stack: " + sortedStack);
    }
}
