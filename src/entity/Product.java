package entity;

import java.util.Objects;

public class Product {

    private int productId;
    private String productName;
    private double sellingPrice;
    private int availableQuantity;
    private Item item;

    public Product() {
    }

    public Product(int productId, String productName, int availableQuantity, Item item) {
        this.productId = productId;
        this.productName = productName;
        this.sellingPrice = item.getBuyingPrice() * 1.5;
        this.availableQuantity = availableQuantity;
        this.item = item;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(product.sellingPrice, sellingPrice) == 0 && availableQuantity == product.availableQuantity && Objects.equals(productName, product.productName) && Objects.equals(item, product.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, sellingPrice, availableQuantity, item);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", availableQuantity=" + availableQuantity +
                ", item=" + item +
                '}';
    }
}
