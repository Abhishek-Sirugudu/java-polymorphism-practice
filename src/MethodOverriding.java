package oopsconcept.polymorsphism;
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
