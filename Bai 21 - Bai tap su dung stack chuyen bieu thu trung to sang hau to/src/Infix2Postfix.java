import java.util.Stack;

public class Infix2Postfix {
    // Ham xac dinh do uu tien cua cac toan tu
    private static int precendence(char operator){
        switch (operator){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Ham chuyen tu trung to sang hau to
    public static String infix2postfix(String expression){
        expression = expression.replace(" ", "");

        String result = "";
        Stack<Character> stack = new Stack<Character>();
        boolean checkPrevIsDigit = false;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // Neu la so, them vao ket qua
            if(Character.isDigit(c)){
                if (checkPrevIsDigit){
                    result+=c;
                }else{
                    result+=(" " + c); // result = result+c;
                }

                checkPrevIsDigit =true;
            }else {
                // Neu gap dau mo ngoac thi day vao stack
                if (c == '(') {
                    stack.push(c);
                }
                // Neu gao dau dong ngoac thi dua cac phan tu trong stack ra cho den khi gap dau mo ngoac
                else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result += (" " + stack.pop());
                    }
                    stack.pop(); // Loai bo dau mo ngoac
                }
                // Neu la toan tu
                else {
                    while (!stack.isEmpty() && precendence(c) <= precendence(stack.peek())) {
                        result += (" " + stack.pop());
                    }
                    stack.push(c);
                }

                // gan false
                checkPrevIsDigit = false;
            }
        }

        // Dua tat cac cac toan tu con lai trong stack ra ket qua
        while(!stack.isEmpty()){
            result+=(" "+stack.pop());
        }

        return result;
    }
}
