package class1;

import java.awt.print.Printable;

public class Student {
        String name;
        int age;
        String grade;


        public static void PrintMethod(String name, int age, String grade) {
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
            System.out.println("Student Grade: " + grade);
        }
}
