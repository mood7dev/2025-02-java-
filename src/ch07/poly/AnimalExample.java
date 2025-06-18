package ch07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();

        BullDog bullDog = new BullDog();
           cat.crying();
           tiger.crying();
           cow.crying();
           dog.crying();
           dog.jump();
           bullDog.crying();
           bullDog.jump();

           /*
           public static void animalCring(Animal animal) {
            animal.carying();
            if( animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.jump();
            }
           */
    }
}
