public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Method Overloading ===");
        System.out.println(calc.add(5, 7));          // Calls int version
        System.out.println(calc.add(3.2, 4.5));      // Calls double version
        System.out.println(calc.add("Hello ", "Abhishek"));       // Calls three-parameter version


        System.out.println("\n=== Method Overriding ===");

        Animal genericAnimal = new Animal();
        Animal myCat = new Cat();  // Upcasting

        genericAnimal.makeSound(); // Animal class version
        myCat.makeSound();        // Cat's overridden version


        Animal[] animals = {new Animal(), new Cat()};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
