import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {
    // Biet so luong phan tu trong stack va vi tri tiep theo
    private int top;
    // Mang chua cac phan tu duoc dua vao STACK
    private T[] stack;
    // Kich thuoc mac dinh cua mang
    private final int DEFAULT_CAPACITY = 100;

    // Tao mot stack rong voi kich thuoc mac dinh
    public ArrayStack(){
        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    // Tao mot stack rong voi kich thuoc duoc truyen vao
    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    private void expandCapacity() {
        // 1 2 3 4 5 6
        // Tao ra mang moi co kich thuoc gap doi
        T[] newStack = (T[])(new Object[stack.length*2]);
        // _ _ _ _ _ _ _ _ _ _ _ _
        // Copy du lieu tu mang cu sang mang moi
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        // 1 2 3 4 5 6 _ _ _ _ _ _
        stack = newStack;
    }

    @Override
    public void push(T element) {
        if(size() == stack.length)
            expandCapacity(); // Mở rộng kích thước của mảng ngăn xếp
        stack[top] = element; // Dua phan tu vao dinh cua stack
        top++; // Tang chi so dinh cua stack len mot
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException(); // Nem ngoai le neu stack rong
        top--; // Giam chi so cua dinh stack
        T result = stack[top]; // Lay phan tu o dinh stack
        stack[top] = null; // Xoa phan tu khoi stack
        return result; // Tra ve phan tu
    }

    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException(); // Nem ngoai le neu stack rong
        return stack[top-1]; // Tra ve phan tu
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }
}
