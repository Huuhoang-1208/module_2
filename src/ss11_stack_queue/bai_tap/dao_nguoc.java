package ss11_stack_queue.bai_tap;

import java.util.Stack;

public class dao_nguoc {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5} ;
        Stack<Integer> numberStack = new Stack<>();
        for (int i = 0; i < numberArray.length; i++) {
            numberStack.push(numberArray[i]);
            System.out.println("numberStack["+i+"]: " + numberArray[i]);
        }
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = numberStack.pop();
        }
        System.out.println("-----------------------------\n" + "Reverted Array" );
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("numberArray["+i+"]: " + numberArray[i]);
        }
    }
}
