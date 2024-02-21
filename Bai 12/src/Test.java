public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Tung", "Ba Lan");
        Person p2 = new Person("An", "Viet Nam");
        Person p3 = new Person("Thinh", "Viet Nam");
        Person p4 = new Person("Hoa", "USA");
        Person p5 = new Person("Lan", "USA");

        Node<Person> node1 = new Node<>();
        node1.setData(p1);

        Node<Person> node2 = new Node<>();
        node2.setData(p2);

        Node<Person> node3 = new Node<>();
        node3.setData(p3);

        Node<Person> node4 = new Node<>();
        node4.setData(p4);

        Node<Person> node5 = new Node<>();
        node5.setData(p5);


        node1.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node2);

        Node<Person> head = node1;
        while(true){
            System.out.println(head.getData());
            head = head.getNext();
            if(head==null) break;
        }
    }
}
