package online_shopping_system;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) throws DuplicateProductIDException {
        for (Product p : cartItems) {
            if (p.productId == product.productId) {
                throw new DuplicateProductIDException("Product with ID " + product.productId + " already exists in the cart.");
            }
        }
        cartItems.add(product);
    }

    public void deleteProduct(int id) throws ProductNotFoundException {
        boolean found = false;
        for (Product item : cartItems) {
            if (item.productId == id) {
                cartItems.remove(item);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ProductNotFoundException("Product with ID " + id + " not found.");
        }
    }

    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product item : cartItems) {
            item.displayDetails();
            System.out.println("----------------------");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.price;
        }
        return total;
    }
}
