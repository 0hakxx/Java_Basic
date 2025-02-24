package poly.ex3;

public abstract class AbstractAnimal { //추상 메서드가 하나라도 있으므로 추상 클래스로 정의

    public abstract void sound(); //추상 메서드 정의

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
