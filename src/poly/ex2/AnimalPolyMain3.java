package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
