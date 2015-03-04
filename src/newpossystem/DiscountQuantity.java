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
public class DiscountQuantity implements DiscountStrategy {

    private DiscountCalcStrategy discountCalculationMethod;
    private int quantityBaseDefault = 1;

    public DiscountQuantity(int quantityBaseDefault, DiscountCalcStrategy discountCalculationMethod) {
        this.discountCalculationMethod = discountCalculationMethod;
        this.quantityBaseDefault = quantityBaseDefault;
    }

    @Override
    public void setDiscountCalculationMethod(DiscountCalcStrategy discountCalculationMethod) {
        this.discountCalculationMethod = discountCalculationMethod;
    }

    @Override
    public double calculateAndReturnSavings(double price, int quantity) {
        if (quantity >= quantityBaseDefault) {
            return discountCalculationMethod.calculateAndReturnSavings(price, quantity);
        } else {
            return 0;
        }
    }

    @Override
    public double calculateAndReturnDiscountedPrice(double price, int quantity) {
        return (quantity * price) - calculateAndReturnSavings(price, quantity);
    }
}