public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> mystack = new ArrayStack<>();
        mystack.push(15);
        mystack.push(10);
        mystack.push(5);

        // 15 10 5

        int x = mystack.pop();
        System.out.println(x); // ? =>5
        // 15 10

        int y = mystack.peek();
        System.out.println(y); // ? => 10
        // 15 10

        int z = mystack.pop();
        System.out.println(z); // ? => 10
        // 15

        System.out.println("------------");
        System.out.println(mystack.size());
    }
}
