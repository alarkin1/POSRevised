/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpossystem;

/**
 *
 * @author Alex
 */
public class PackerBallCap implements ProductStrategy {

    private int upc = 98532;
    private String productName = "Packer Ball Cap";
    private DiscountStrategy discount;
    private double price;

    public PackerBallCap(DiscountStrategy discount, double price) {
        setDiscount(discount);
        setPrice(price);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discount;
    }

    public String getProductName() {
        return productName;
    }

    public int getUpc() {
        return upc;
    }

    public double getPrice() {
        return price;
    }

    public void setUpc(int upc) throws RuntimeException{
        if (upc >= 0) {
            this.upc = upc;
        } else {
            throw new IllegalArgumentException("upc must be passed a value greater than or equal to 0");
        }
    }

    public void setProductName(String productName) throws RuntimeException {
        if (productName != null) {
            this.productName = productName;
        } else {
            throw new NullPointerException("productName cannot be passed a null");
        }
    }

    public void setDiscount(DiscountStrategy discount) throws RuntimeException {
        if (discount != null) {
            this.discount = discount;
        } else {
            throw new NullPointerException("discount cannot be passed a null");
        }
    }

    public void setPrice(double price) throws RuntimeException {
        if (price > -1) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be set to less than 0");
        }
    }

}
