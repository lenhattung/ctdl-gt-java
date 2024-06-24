public class StringReversal {
    public static String reverseString(String input){
        ArrayStack<Character> stack = new ArrayStack<Character>();

        // Dua tung ky tu vao stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // La tung ky tu stack va ghep lai de tao thanh chuoi dao nguoc
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();

        // La tung ky tu stack va ghep lai de tao thanh chuoi dao nguoc
        //String reversed = "";
        //while (!stack.isEmpty()){
        //    reversed = reversed + stack.pop();
        //}
        //
        //return reversed;
    }
}
