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
    @Override
    public void speak() {
        System.out.println("The dog barks."); // Line breakpoint here
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("The cat meows."); // Line breakpoint here
    }
}
