class Girl {

    private int age;
    private String name; 
    
    Girl() {
        System.out.println("Default constructor calling....");
        age = 21;
        name = "Emilia";
    }

    public void display() {
        System.out.println("Name: " + name + " age: " + age);        // same as this.name & this.age in this case
    }
}

public class Sample {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.display();
    }
}
