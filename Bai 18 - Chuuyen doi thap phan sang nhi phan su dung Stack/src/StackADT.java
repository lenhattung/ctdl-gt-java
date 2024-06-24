public interface StackADT<T> {
    // Thêm một phần tử vào đỉnh của stack
    public void push(T element);

    // Trả về và loại bỏ phần tử ở đỉnh stack
    public T pop();

    // Trả về nhưng không loại bỏ phần tử ở đỉnh stack
    public T peek();

    // Kiểm tra stack rỗng
    public boolean isEmpty();

    // Lấy ra số lượng phần tử của stack
    public int size();

    // Lấy ra chuỗi các phần tử của stack
    public String toString();
}
