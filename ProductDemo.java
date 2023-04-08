public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Toaster", 29.95);
        Product product2 = new Product("Blender", 49.99);

        System.out.println("Product 1: " + product1.getName() + " $" + product1.getPrice());
        System.out.println("Product 2: " + product2.getName() + " $" + product2.getPrice());
    }
}