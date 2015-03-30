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
        setQuantityBaseDefault(quantityBaseDefault);
    }

    @Override
    public final void setDiscountCalculationMethod(DiscountCalcStrategy discountCalculationMethod) throws RuntimeException {
        if (discountCalculationMethod != null) {
            this.discountCalculationMethod = discountCalculationMethod;
        } else {
            throw new NullPointerException("discountCalculationMethod cannot be passed a null");
        }
    }

    private void setQuantityBaseDefault(int quantityBaseDefault) throws RuntimeException{
        if (quantityBaseDefault > 1) {
            this.quantityBaseDefault = quantityBaseDefault;
        } else {
            throw new IllegalArgumentException("quantityBaseDefault can not be less than 1");
        }
    }

    @Override
    public final double calculateAndReturnSavings(double price, int quantity) throws RuntimeException{
        if (quantity >= quantityBaseDefault && price >= 1) {
            return discountCalculationMethod.calculateAndReturnSavings(price, quantity);
        } else {
            throw new IllegalArgumentException("price must be passed a value greater than or equal to 1 and quantity must be passed a value greater than or equal to quantityBaseDefault");
        }
    }

    @Override
    public final double calculateAndReturnDiscountedPrice(double price, int quantity) throws RuntimeException{
        return (quantity * price) - calculateAndReturnSavings(price, quantity);
    }
}
