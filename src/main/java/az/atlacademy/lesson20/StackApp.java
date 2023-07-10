package az.atlacademy.lesson20;

import java.util.Deque;
import java.util.LinkedList;

public class StackApp {
    private static final Deque<operation> stack = new LinkedList<>();

    public static void main(String[] args) {
        doOperation();
    }

    public static String doOperation() {
        int random = (int) (Math.random() * operation.values().length);
        stack.add(operation.values()[random]);
        return stack.peek().toString();
    }

    public static String ctrlZ() {
        operation operationEnum = stack.peek();
        stack.poll();
        return operationEnum.toString();
    }
}
