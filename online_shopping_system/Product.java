package online_shopping_system;

public class Product {
    protected String productName;
    protected int productId;
    protected double price;
    protected int quantityInStock;

    public Product(String productName, int productId, double price, int quantityInStock) throws IllegalArgumentException {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (productId <= 0) {
            throw new IllegalArgumentException("Product ID must be positive.");
        }
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price:" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
}
