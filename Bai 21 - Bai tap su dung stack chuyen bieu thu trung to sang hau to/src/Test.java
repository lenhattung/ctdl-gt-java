public class Test {
    public static void main(String[] args) {
        String infix = "3 + 4 * 2 / (1 - 5) ^ 2";
        String postfix = Infix2Postfix.infix2postfix(infix);
        System.out.println("infix: " + infix);
        System.out.println("postfix: " + postfix);

        String infix2 = "3 + 145 * 20 / (1 - 53) ^ 2";
        String postfix2 = Infix2Postfix.infix2postfix(infix2);
        System.out.println("infix2: " + infix2);
        System.out.println("postfix2: " + postfix2);
    }
}
