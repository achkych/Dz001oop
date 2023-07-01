import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Create products (Создаем товары)
        Product product1 = new Product("Laptop", 1500, 5);
        Product product2 = new Product("Smartphone", 800, 4);
        Product product3 = new Product("Headphones", 100, 3);

        // Create categories and add products to them (Создаем категории и добавляем товары в них)
        Category category1 = new Category("Electronics");
        category1.addProduct(product1);
        category1.addProduct(product2);

        Category category2 = new Category("Accessories");
        category2.addProduct(product3);

        // Create users (Создаем пользователей)
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Add products to users baskets (Добавляем товары в корзину пользователей)
        user1.getBasket().addProduct(product1);
        user2.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product3);

        // Display product catalog (Выводим каталог продуктов)
        System.out.println("Product Catalog:");
        System.out.println("Category: " + category1.getName());
        for (Product product : category1.getProducts()) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }

        System.out.println("Category: " + category2.getName());
        for (Product product : category2.getProducts()) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }

        // Display users purchases (Выводим покупки пользователей)
        System.out.println("Users' Purchases:");
        System.out.println("User: " + user1.getUsername());
        for (Product product : user1.getBasket().getPurchasedProducts()) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }

        System.out.println("User: " + user2.getUsername());
        for (Product product : user2.getBasket().getPurchasedProducts()) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice() + ", Rating: " + product.getRating());
        }
    }

}