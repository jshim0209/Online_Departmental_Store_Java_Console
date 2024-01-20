package dao;

import entity.Product;

public class ProductDAO {

    private ItemDAO itemDAO;
    private Product[] products;
    private Product nikeShoesProduct;
    private Product rlShirtsProduct;
    private Product macBookProduct;
    private Product iPhone15Product;
    private Product levisJeansProduct;
    public ProductDAO() {
        itemDAO = new ItemDAO();
        nikeShoesProduct = new Product(1, "Nike Shoes", 100, itemDAO.nikeShoes);
        rlShirtsProduct = new Product(2, "Ralph Lauren Shirts", 300, itemDAO.rlShirts);
        macBookProduct = new Product(3, "MacBook", 500, itemDAO.macBook);
        iPhone15Product = new Product(4, "iPhone 15", 300, itemDAO.iPhone15);
        levisJeansProduct = new Product(5, "Levi's Jeans", 800, itemDAO.levisJeans);
        products = new Product[]{nikeShoesProduct, rlShirtsProduct, macBookProduct, iPhone15Product, levisJeansProduct};
    }

    public void findAllProducts() {
        for (Product product : products) {
            System.out.println(
                    "Product ID: " + product.getProductId() +
                            ", Product Name: " + product.getProductName() +
                            ", Category: " + product.getItem().getCategory() +
                            ", Available Quantity: " + product.getAvailableQuantity() +
                            ", Price: " + product.getSellingPrice()
            );
        }
    }

    public void findProductById() {
    }

    public void findProductsByCategory() {
    }

    public void findProductByName() {
    }
}
