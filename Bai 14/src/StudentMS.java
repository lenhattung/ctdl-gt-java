public class StudentMS {
    private LinkedList<Student> list;

    public StudentMS() {
        this.list = new LinkedList<Student>();
    }

    public void addStudent(Student student){
        this.list.addLast(student);
    }

    public void printList(){
        this.list.traverse();
    }

    public boolean find(Student student){
        return list.findItem(student);
    }

    public void update(Student student){
        Node<Student> tmp = list.getHead();
        while(tmp!=null){
            Student st = tmp.getData();
            if(st.getId().equals(student.getId())){
                st.setFullName(student.getFullName());
                st.setAge(student.getAge());
                st.setGpa(student.getGpa());
            }
            tmp = tmp.getNext();
        }
    }

    public void remove(Student student){
        this.list.remove(student);
    }

    public int countStudent(String fullName){
        int count =0;
        Node<Student> tmp = list.getHead();
        while(tmp!=null){
            Student st = tmp.getData();
            if(st.getFullName().equals(fullName)){
              count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }

}
