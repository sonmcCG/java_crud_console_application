import java.util.ArrayList;

public class Methods {
    ArrayList<Student> students = new ArrayList<>();
    public void add(Student s){
        students.add(s);
    }
    public void update(Student s){
        for (Student student: students) {
            if(student.getId() == s.getId()){
                String name = s.getName();
                student.setName(name);
                String address = s.getAddress();
                student.setAddress(address);
                int age = s.getAge();
                student.setAge(age);
            }
        }
    }

    public void delete(int id){
        for (Student student: students) {
            if(student.getId() == id){
                students.remove(student);
            }
        }
    }
    public void showAll(){
        for (Student s: students) {
            System.out.println(s.toString());
        }
    }
}
