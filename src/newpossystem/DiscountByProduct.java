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

    public DiscountByProduct(DiscountCalcStrategy discountCalculationMethod) throws RuntimeException{
        setDiscountCalculationMethod(discountCalculationMethod);
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
    public final double calculateAndReturnSavings(double price, int quantity) throws RuntimeException{
        return discountCalculationMethod.calculateAndReturnSavings(price, quantity);
    }

    @Override
    public final double calculateAndReturnDiscountedPrice(double price, int quantity) throws RuntimeException{
        return (price * quantity) - calculateAndReturnSavings(price, quantity);
    }
}
