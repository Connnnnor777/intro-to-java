
/**
 * Write a description of class Car here.
 *
 * @author (Connor)
 * @version (3/5/23)
 */
public class Car {
    private String make;
    private String model;
    private double price;

    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

