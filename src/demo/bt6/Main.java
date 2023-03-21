package demo.bt6;
import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Biểu thức 1--> :" + checkBracket("s * (s – a) * (s – b) * (s – c) "));
        System.out.println("Biểu thức 2--> :" + checkBracket("(– b + (b2 – 4 * a * c)^0.5) / 2*a"));
        System.out.println("Biểu thức 3--> :" + checkBracket("(s * (s – a) * (s – b * (s – c)"));
        System.out.println("Biểu thức 4--> :" + checkBracket("s * (s – a) * s – b) * (s – c)"));
        System.out.println("Biểu thức 5--> :" + checkBracket("(– b + (b^2 – 4 * a * c)^(0.5/ 2 * a))"));
    }
    public static boolean checkBracket(String data) {
        Stack<String> charStack = new Stack<>();
        String[] arr = data.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                charStack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                if (charStack.isEmpty() || charStack.pop().equals("")) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
