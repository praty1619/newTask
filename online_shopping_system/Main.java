package online_shopping_system;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating some sample products
            Electronics laptop = new Electronics("Laptop", 1, 62000.0, 5, "Dell", 4);
            Electronics Phone = new Electronics("Phone", 1, 23000.0, 5, "Samsung", 1);
            Clothing shirt = new Clothing("Shirt", 3, 1200.0, 10, "M", "Cotton");
            Clothing oversizedTee = new Clothing("oversizedTee", 4, 750.0, 5, "M", "");

            // Adding products to the shopping cart
            ShoppingCart cart = new ShoppingCart();
            cart.addProduct(laptop);
            cart.addProduct(shirt);
            cart.addProduct(Phone);
            cart.addProduct(oversizedTee);


            cart.displayCart();

            // Calculating and displaying the total price
            double totalPrice = cart.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);

            // Delete a product
            cart.deleteProduct(1);

            // Displaying the updated cart
            cart.displayCart();
        } catch (IllegalArgumentException | DuplicateProductIDException | ProductNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
