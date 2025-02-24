package poly.ex06;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound(){
        System.out.println("치킨!");
    }
    @Override
    public void fly(){
        System.out.println("새 날다!");
    }
}
