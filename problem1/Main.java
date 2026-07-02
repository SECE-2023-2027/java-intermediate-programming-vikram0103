package Problem1;
public class Main {

    public static void main(String[] args) {
        Product p = new Product("P101", "Laptop", 1000.0, 15);

        p.applyDiscount(10);

        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
    }
}