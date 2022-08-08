import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap so thap phan: ");
        int number = scanner.nextInt();
        while (number != 0 ){
            int x =number %2;
            stack.push(x);
            number /=2;
        }
        System.out.println("\n Gia tri nhi phan la: ");
        while (!(stack.isEmpty())){
            System.out.println(stack.pop());
        }
        System.out.println();

    }
}
