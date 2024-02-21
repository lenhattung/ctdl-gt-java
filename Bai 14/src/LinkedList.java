public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Duyet tung phan tu
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            // In phan tu
            System.out.println(tmp.getData());
            // Chuyen den phan tu tiep theo
            tmp = tmp.getNext();
        }
    }

    // Them node vao dau danh sach
    public void addFirst(T item) {
        // Buoc 1
        //Node<T> newNode = new Node<>(item, this.head);
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);

        // Buoc 2
        this.head = newNode;
    }


    // Them node vao cuoi danh sach lien ket
    public void addLast(T item) {
        if (head == null) {
            addFirst(item);
        } else {
            // Buoc 1
            Node<T> newNode = new Node<>(item, null);

            // Buoc 2
            Node<T> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    // Them vao phia sau mot node
    public void insertAfter(T key, T toInsert) {

        // Buoc 2: di tim vi tri cua key
        Node<T> tmp = head;
        // Tim node chua key
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }
        // Tim ra duoc node chua key, hoac la di den cuoi ll

        // Them vao khi tmp <> null
        if (tmp != null) {
            // Buoc 1
//            Node<T> newNode = new Node<>();
//            newNode.setData(toInsert);
            // 2
//            newNode.setNext(tmp.getNext());

            // 1 + 2
            Node<T> newNode = new Node<>(toInsert, tmp.getNext());

            // 3
            tmp.setNext(newNode);
        }
    }

    // Xoa mot node
    public boolean remove(T key){
        if(head == null)
            return false;

        // Xoa neu key o vi tri dau tien
        if(head.getData().equals(key)){
            this.head = head.getNext();
            return true;
        }

        // Tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;

        while(cur!=null && !cur.getData().equals(key)){
            prev = cur;
            cur = cur.getNext();
        }

        if(cur==null)
            return false;

        // Xoa node
        prev.setNext(cur.getNext());
        return true;
    }

    public boolean isEmpty(){
//        if(head==null)
//            return true;
//        else
//            return false;

        return head==null;
    }

    public int size(){
        int count = 0;

        Node<T> tmp = head;
        while (tmp != null) {
            // Tang gia tri
            count++;
            // Chuyen den phan tu tiep theo
            tmp = tmp.getNext();
        }

        return count;
    }

    public boolean findItem(T item){
        Node<T> tmp = head;
        while (tmp != null) {
            if(tmp.getData().equals(item)){
                return true;
            }
            // Chuyen den phan tu tiep theo
            tmp = tmp.getNext();
        }
        return false;
    }


    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
