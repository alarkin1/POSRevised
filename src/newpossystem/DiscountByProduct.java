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
public class DiscountByProduct implements DiscountStrategy {

    private DiscountCalcStrategy discountCalculationMethod;
    private int quantity = 1;

    public DiscountByProduct(DiscountCalcStrategy discountCalculationMethod) {
        this.discountCalculationMethod = discountCalculationMethod;
        this.quantity = quantity;
    }

    @Override
    public void setDiscountCalculationMethod(DiscountCalcStrategy discountCalculationMethod) {
        this.discountCalculationMethod = discountCalculationMethod;
    }

    @Override
    public double calculateAndReturnSavings(double price, int quantity) {
        return discountCalculationMethod.calculateAndReturnSavings(price, quantity);
    }

    @Override
    public double calculateAndReturnDiscountedPrice(double price, int quantity) {
        return (price * quantity) - calculateAndReturnSavings(price, quantity);
    }
}
