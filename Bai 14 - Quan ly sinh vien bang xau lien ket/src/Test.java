public class Test {
    public static void main(String[] args) {
        StudentMS sms = new StudentMS();

        Student s1 = new Student("MS01", "Le Nhat Tung", 18, 9.8f);
        Student s2 = new Student("MS02", "Nguyen Van A", 19, 6f);
        Student s3 = new Student("MS03", "Le Thi C", 20, 10f);
        Student s4 = new Student("MS04", "Tran Van D", 21, 7f);

        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);
        sms.addStudent(s4);

        sms.printList();

        System.out.println("--------");
        Student s5 = new Student("MS05", "Tran Van D", 21, 7f);
        System.out.println(sms.find(s5));

        System.out.println("--------");
        //Student s6 = new Student("MS06", "Tran Van X1", 30, 8f);
        Student s6 = new Student("MS04", "Tran Van X1", 30, 8f);
        sms.update(s6);
        sms.printList();

        // Test count
        Student s7 = new Student("MS07", "Tran Van X1", 21, 7f);
        sms.addStudent(s7);
        sms.printList();
        System.out.println("--------");
        System.out.println("So sv .. X1: "+ sms.countStudent("Tran Van X1"));


        // Test remove
        sms.remove(s7);
        sms.printList();
    }
}
