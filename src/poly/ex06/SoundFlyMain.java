package poly.ex06;


public class SoundFlyMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        Chicken chicken = new Chicken();

        soundAnimal(bird);
        soundAnimal(dog);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);

    }


    public static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
    }


    public static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
