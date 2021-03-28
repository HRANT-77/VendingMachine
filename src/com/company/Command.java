package com.company;

public class Command {
    private int quantity;
    private int prodType;
    private ProductType productType;

    public Command() {
    }

    public Command(ProductType productType, int prodType, int quantity) {
        this.quantity = quantity;
        this.prodType = prodType;
        this.productType = productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProdType() {
        return prodType;
    }

    public void setProdType(int prodType) {
        this.prodType = prodType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
