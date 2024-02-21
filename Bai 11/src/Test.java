public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Le Nhat Tung", "Ba Lan");
        Person p2 = new Person("Nguyen Van A", "Viet Nam");
        Person p3 = new Person("Le Thi B", "Viet Nam");
        Person p4 = new Person("Elon", "USA");
        Person p5 = new Person("Bill", "USA");

        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);
        p4.setNext(p5);

        Person cur = p1;
        while(true){
            System.out.println(cur);
            cur = cur.getNext();
            if(cur==null) break;
        }
    }
}
