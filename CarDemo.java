public class CarDemo {
    public static void main(String[] args) {
        Car vehicle1 = new Car("Honda","Civic", 29000.95);
        Car vehicle2 = new Car("Pagani","Zonda", 23649999.99);

        System.out.println("Vehicle 1: " + vehicle1.getMake() +" "+ vehicle1.getModel()+ " $" + vehicle1.getPrice());
        System.out.println("Vehicle 2: " + vehicle2.getMake() +" "+ vehicle2.getModel()+ " $" + vehicle2.getPrice());
    }
}
