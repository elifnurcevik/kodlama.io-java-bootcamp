package io.pera.ClassesWithAttributes;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Leptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }

}

// OUTPUT
/*

Product added: Laptop

 */
