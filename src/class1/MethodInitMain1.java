package class1;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit obj1 = new MemberInit("학생1", 13, "A+");
        MemberInit obj2 = new MemberInit("학생2", 12, "B");


        MemberInit[] objArray = new MemberInit[2];
        objArray[0] = obj1;
        objArray[1] = obj2;
        for (MemberInit memberInit : objArray) {
            System.out.println(memberInit.name  + " " + memberInit.age  + " " + memberInit.grade);
        }

    }

}
