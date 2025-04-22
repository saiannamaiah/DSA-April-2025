import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        var str = "ABCD";
//        var reserved = "";
//        for(int i= str.length()- 1; i >= 0;i-- ){
//            reserved = reserved + str.charAt(i);
//        }
//        System.out.println(reserved);
//
//
//        Stack<Character> stackStr = new Stack<>();
//
//        var newStr = "LMNO";
//
//        for(char ch: newStr.toCharArray()){
//            stackStr.push(ch);
//        }
//        System.out.println("______________");
//        System.out.println(stackStr.toString());
//
//        StringBuffer reveresedNew = new StringBuffer();
//        while(!stackStr.empty()) {
//            reveresedNew.append(stackStr.pop());
//        }
//        System.out.println("--------");
//        System.out.println(reveresedNew);

        var str = "(1+2)";

        Stack<Character> stackCheckForNiceEquation = new Stack<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(') {
                stackCheckForNiceEquation.push(ch);
            }
            if (ch ==')') {
                stackCheckForNiceEquation.pop();
            }
        }

        if (stackCheckForNiceEquation.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}