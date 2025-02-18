public class MethodBreakpointDemo {
    public static void main(String[] args) {
        System.out.println("Starting program...");

        Animal myDog = new Dog(); // Polymorphism
        Animal myCat = new Cat();

        myDog.speak(); // Method breakpoint here will trigger before execution
        myCat.speak();

        System.out.println("Program finished.");
    }
}

class Animal {
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {

    int volume = 9;

    @Override
    public void speak() {
        System.out.println("The dog barks with a volume of " + volume);
        volume = 5;
        System.out.println("The dog barks softly with a volume of " + volume);
    }
}

class Cat extends Animal {
    int volume = 7;

    @Override
    public void speak() {
        System.out.println("The cat meows with a volume of " + volume);
        volume = 3;
        System.out.println("The cat meows softly with a volume of " + volume);
    }
}
