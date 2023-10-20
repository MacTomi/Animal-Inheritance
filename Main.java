public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Lion myLion = new Lion();
        Wolf myWolf = new Wolf();

        for (Animal animal : new Animal[] { myCat, myDog, myLion, myWolf }) {
            System.out.println("Scientific Name: " + animal.getScientificName());
            System.out.println("Sound: " + animal.getSound());
            System.out.println("Food: " +  animal.getFood());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}
