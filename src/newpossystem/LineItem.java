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
public class LineItem {

    private String lineItemName;
    private int upc;
    private double itemPrice;
    private ProductStrategy product;
    private int quantity;

    public LineItem(ProductStrategy product, int quantity) {
        if (product != null) {
            setProduct(product);
            setLineItemName(product.getProductName());
            setUpc(product.getUpc());
            setItemPrice(product.getPrice());
            setQuantity(quantity);
        } else {
            setProduct(null);
            setLineItemName(null);
            setUpc(0);
            setItemPrice(0);
            setQuantity(0);
        }
    }

    public final ProductStrategy getProduct() {
        return product;
    }

    private final void setProduct(ProductStrategy product) {
        //validation needed
        this.product = product;
    }

    public final String getLineItemName() {
        return lineItemName;
    }

    private final void setLineItemName(String lineItemName) {
        //validation needed
        this.lineItemName = lineItemName;
    }

    public final int getUpc() {
        return upc;
    }

    private final void setUpc(int upc) {
        //validation needed
        this.upc = upc;
    }

    public final double getItemPrice() {
        return itemPrice;
    }

    private final void setItemPrice(double itemPrice) {
        //validation needed
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        //needs validation
        this.quantity = quantity;
    }

    public final double calculateAndReturnSavings() {
        //validation needed
        return product.getDiscountStrategy().calculateAndReturnSavings(itemPrice, quantity);
    }

    public final double calculateAndReturnDiscountedPrice() {
        //validation needed
        return product.getDiscountStrategy().calculateAndReturnDiscountedPrice(itemPrice, quantity);
    }

}
