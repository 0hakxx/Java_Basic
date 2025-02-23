package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData vd = new ValueData();
        vd.add();
        vd.add();
        vd.add();
        System.out.println("최종 value의 값은 : " + vd.value + "입니다. ");
    }
}
