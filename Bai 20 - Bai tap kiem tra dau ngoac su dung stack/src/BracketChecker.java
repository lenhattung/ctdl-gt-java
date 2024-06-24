public class BracketChecker {
    public static boolean isBalanced(String code){
        LinkedStack<Character> stack = new LinkedStack<Character>();
        // Duyet lan luot tung ky tu
        // Tinh huong thu 0: nhung ky tu khac => Khong quan tam toi
        for (int i=0; i<code.length(); i++) {
            char ch = code.charAt(i);

            // Tinh huong thu 1: [, {, (
            // Dua vao ben trong stack
            if (ch == '{' || ch =='(' || ch=='['){
                stack.push(ch);
            }else if (ch == '}' || ch ==')' || ch==']') {
                // Tinh huong thu 2: ], }, )
                // Kiem tra stack no co rong? Neu rong => false
                // Neu khong rong => Lay ky tu o dinh stack => Neu ky tu o dinh stack giong voi ky tu hien tai => true, nguoc lai la false
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                System.out.println("Ch = "+ch+" top = "+ top);
                if((ch==']' && top!='[') || (ch==')' && top!='(') || (ch=='}' && top!='{')){
                    return false;
                }
            }
        }
        // (
        return stack.isEmpty();
    }
}
