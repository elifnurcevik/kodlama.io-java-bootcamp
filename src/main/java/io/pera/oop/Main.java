package io.pera.oop;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram");

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unitPrice = 16000;
        product2.detail = "32 GB Ram";

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "HP 5";
        product3.unitPrice = 1000;
        product3.detail = "8 GB Ram";

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Computer";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Home/Garden";

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);

        productManager.addToCart(product2);

        productManager.addToCart(product3);

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println("Product id: " + product.id);
            System.out.println("Product name: " + product.name);
            System.out.println("Product unit price: " + product.unitPrice);
            System.out.println("Product detail: " + product.detail);
            System.out.println();
        }
    }
}
