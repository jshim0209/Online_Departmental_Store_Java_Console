package client;

import service.ItemService;
import service.ProductService;
import service.UserService;

public class StoreInformation {

    private ProductService productService;
    private UserService userService;
    private ItemService itemService;

    public StoreInformation() {
        productService = new ProductService();
        userService = new UserService();
        itemService = new ItemService();
    }

    public boolean login(String username, String password) {
        userService.isAuthenticated();
        return false;
    }

    public void getAllProducts() {
        productService.getAllProducts();
    }

    public void getProductById() {
        productService.getProductById();
    }

    public void getProductsByCategory() {
        productService.getProductsByCategory();
    }

    public void getProductByName() {
        productService.getProductByName();
    }

    public void getTotalAmountSpent() {
        productService.getTotalAmountSpent();
    }

    public void getProfitAmountByCategory() {
        productService.getProfitAmountByCategory();
    }
}
