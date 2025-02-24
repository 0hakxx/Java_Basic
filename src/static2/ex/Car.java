package static2.ex;

public class Car {
    private String name;
    private static int Count;

    public Car(String name){
        this.name = name;
        System.out.println("차량 구입, 이름 " + this.name);
        Count++;
    }

    public static void showTotalCars(){
        System.out.println("Total cars in car are: " + Count);
    }


}
