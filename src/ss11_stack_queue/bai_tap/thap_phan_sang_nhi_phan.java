package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class thap_phan_sang_nhi_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> numberStack = new Stack<>();
        System.out.println("Vui lòng nhập số bất kỳ !");
        int number = Integer.parseInt(sc.nextLine());
        int temp;

        while (number != 0) {
            temp = number % 2;
            numberStack.add(temp);
            number /= 2;
        }
        System.out.println("Số nhị phân: ");
        while (!numberStack.isEmpty()) {
            System.out.println(numberStack.pop());
        }
    }
}
