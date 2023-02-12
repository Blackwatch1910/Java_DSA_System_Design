class Dog {

    private int age;
    private String name;

    Dog() {
        // super();          present before by default
        this(8, "Luther");
        System.out.println("Default constructor executing...");
        age = 2;
        name = "Pluto";
    }

    Dog(int age) {
        this.age = age;
    }

    Dog(int age, String name) {
        this.name = name;
        this.age = age;
        System.out.println("Passed values from first constructor:" + this.name + " & " + this.age);
    }

    public void display() {
        System.out.println("Age: " + age + " Name: " + name);
    }
}

public class ThisAndSuper {
   public static void main(String[] args) {
    Dog dog = new Dog();
    dog.display();

    Dog german = new Dog(3);
    german.display();

    // Dog belgian = new Dog(1, "Max");
    // belgian.display();
   }
}
