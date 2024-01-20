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

    public void getProductById() {
        productDAO.findProductById();
    }

    public void getProductsByCategory() {
        productDAO.findProductsByCategory();
    }

    public void getProductByName() {
        productDAO.findProductByName();
    }

    public void getTotalAmountSpent() {
    }

    public void getProfitAmountByCategory() {
    }
}
