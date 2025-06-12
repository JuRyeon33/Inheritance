class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    String bread;

    public Dog(String name, String bread) {
        super(name);
        this.bread = bread;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}