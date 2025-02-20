package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        CreateStudent("학생1", 22, "90");
    }

    public static void CreateStudent(String name, int age, String grade){
        Student s1 = new Student();
        System.out.println(s1);
        s1.name=name;
        s1.age=age;
        s1.grade=grade;
        StudentMethod(s1);
        return;
    }


    public static void StudentMethod(Student student){
        System.out.println(student);
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }

}
