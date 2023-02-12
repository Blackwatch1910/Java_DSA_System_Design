class Car {
    private int year;
    private String model;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
}

public class Launch1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Mustang");
        car.setYear(1969);

        int year = car.getYear();
        String model = car.getModel();

        System.out.println("Model: " + model + " => " + year);
    }
}