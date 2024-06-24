import java.util.Stack;

public class Evaluator {

    public static double calculate(double a, double b, char operator){
        double r = 0;
        switch (operator){
            case '+':
                r = a + b;
                break;
            case '-':
                r = a - b;
                break;
            case '*':
                r = a * b;
                break;
            case '/':
                r = a / b;
                break;
            case '^':
                r = Math.pow(a, b);
                break;
        }
        return r;
    }
    // Ham tinh gia tri bieu thuc hau to
    public static double evaluatePostfix(String expression){
        Stack<Double> stack = new Stack<Double>();
        expression = expression.trim(); // Loai bo khoang trang o 2 dau

        String[] tokens = expression.split(" ");
        for (int i = 0; i < tokens.length; i++) {
           // System.out.println(stack.toString());
            String token = tokens[i];

            // Neu la so day vao stack
            if(token.matches("\\d+")){
                // Ep kieu ve so thuc
                double value = Double.parseDouble(token);
                // Push vao stack
                stack.push(value);
            }else{
                // Neu la toan tu, lay hai toan hang tu stack de thuc hien phep tinh
                double b = stack.pop();
                double a = stack.pop();
                double r = calculate(a, b, token.charAt(0));
                stack.push(r);
            }
        }
        // Tra ve ket qua cua bieu
        return stack.pop();
    }

    // Ham tinh gia tri bieu thuc trung to
    public static double evaluate(String expression){
        // Buoc 1
        String exp2 = Infix2Postfix.infix2postfix(expression);
        // Buoc 2
        return evaluatePostfix(exp2);
    }
}
