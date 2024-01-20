package service;

import dao.ProductDAO;

public class ProductService {
    private ProductDAO productDAO;

    public ProductService() {
        productDAO = new ProductDAO();
    }
    public void getAllProducts() {
        productDAO.findAllProducts();
    }

    public void getProductById(int productId) {

        productDAO.findProductById(productId);
    }

    public void getProductsByCategory(String category) {

        productDAO.findProductsByCategory(category);
    }

    public void getProductByName(String productName) {

        productDAO.findProductByName(productName);
    }

    public void getTotalAmountSpent() {
    }

    public void getProfitAmountByCategory() {
    }
}
