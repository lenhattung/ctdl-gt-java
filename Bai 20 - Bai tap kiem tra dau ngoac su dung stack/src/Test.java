public class Test {
    public static void main(String[] args) {
        String code1 = "{[()]}";
        String code2 = "{[()]";
        String code3 = "{[(])}";
        String code4 = "public interface StackADT<T> {\n" +
                "    // Thêm một phần tử vào đỉnh của stack\n" +
                "    public void push(T element);\n" +
                "\n" +
                "    // Trả về và loại bỏ phần tử ở đỉnh stack\n" +
                "    public T pop();\n" +
                "\n" +
                "    // Trả về nhưng không loại bỏ phần tử ở đỉnh stack\n" +
                "    public T peek();\n" +
                "\n" +
                "    // Kiểm tra stack rỗng\n" +
                "    public boolean isEmpty();\n" +
                "\n" +
                "    // Lấy ra số lượng phần tử của stack\n" +
                "    public int size();\n" +
                "\n" +
                "    // Lấy ra chuỗi các phần tử của stack\n" +
                "    public String toString();\n" +
                "}";

        System.out.println("Check code1: "+ BracketChecker.isBalanced(code1));
        System.out.println("----");
        System.out.println("Check code2: "+ BracketChecker.isBalanced(code2));
        System.out.println("----");
        System.out.println("Check code3: "+ BracketChecker.isBalanced(code3));
        System.out.println("----");
        System.out.println("Check code4: "+ BracketChecker.isBalanced(code4));
    }
}
