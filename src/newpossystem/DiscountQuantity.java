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
        setDiscountCalculationMethod(discountCalculationMethod);
        this.quantityBaseDefault = quantityBaseDefault;
    }

    @Override
    public final void setDiscountCalculationMethod(DiscountCalcStrategy discountCalculationMethod) throws RuntimeException{
        if (discountCalculationMethod != null) {
            this.discountCalculationMethod = discountCalculationMethod;
        } else {
            throw new NullPointerException("discountCalculationMethod cannot be passed a null");
        }
    }

    
    
    @Override
    public final double calculateAndReturnSavings(double price, int quantity) {
        if (quantity >= quantityBaseDefault) {
            return discountCalculationMethod.calculateAndReturnSavings(price, quantity);
        } else {
            return 0;
        }
    }

    @Override
    public final double calculateAndReturnDiscountedPrice(double price, int quantity) {
        return (quantity * price) - calculateAndReturnSavings(price, quantity);
    }
}
