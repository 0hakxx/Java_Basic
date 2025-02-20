package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        Student s1 = new Student(); //x001
        System.out.println(s1);
        s1.name = "학생1";
        s1.age = 21;
        s1.grade = "A+";


        Student s2 = new Student();//x002
        s2.name = "학생2";
        s2.age = 22;
        s2.grade = "B+";

        Student[] Students = new Student[2]; //x001과 x002 참조 변수를 저장
        Students[0] = s1;
        Students[1] = s2;


//        Student.PrintMethod(s1.name, s1.age, s1.grade);
//        Student.PrintMethod(s2.name, s2.age, s2.grade);
//        배열 접근
        for(int i=0;i<Students.length;i++){
            System.out.println(Students[i].name + Students[i].age + Students[i].grade);
        }
    }
}

