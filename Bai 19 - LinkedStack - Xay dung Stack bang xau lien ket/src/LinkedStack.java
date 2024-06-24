import java.util.EmptyStackException;

public class LinkedStack<T> implements StackADT<T>{
    private int count;
    private LinkedNode<T> top;

    public LinkedStack(){
        count = 0;
        top = null;
    }

    @Override
    public void push(T element) {
        //        // Buoc 1 - tao ra mot node moi
        //        LinkedNode<T> temp = new LinkedNode<T>(element, null);
        //        // Buoc 2 - gan next element cho temp
        //        temp.setNext(top);
      LinkedNode<T> temp = new LinkedNode<T>(element, top);
      top = temp;
      count++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException(); // Nem ngoai le neu stack rong
        T result = top.getData(); // Lay ra gia tri cua top node
        top = top.getNext(); // Di chuyen top tro sang phan tu tiep theo
        count--; // Giam so luong phan tu
        return result; // Tra ve ket qua
    }

    @Override
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException(); // Nem ngoai le neu stack rong

        return top.getData(); // Tra ve gia tri tai vi tri top
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public int size() {
        return count;
    }
}
