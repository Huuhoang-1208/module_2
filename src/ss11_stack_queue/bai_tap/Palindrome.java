package ss11_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi : ");
        String string = sc.nextLine();
        Queue<Character> tempQueue = new LinkedList<>();
        Stack<Character> tempStack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            tempQueue.add(string.charAt(i));
            tempStack.add(string.charAt(i));
        }
        boolean check = true;
        for (int i = 0;  i < tempQueue.size(); ) {
            if (!tempQueue.poll().equals(tempStack.pop())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(string + " is a palindrome");
        } else System.out.println(string + " is not a palindrome");
    }
}
