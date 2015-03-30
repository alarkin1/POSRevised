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
public class DiscountCalcPercentage implements DiscountCalcStrategy {

    private double amountOff = 1;

    public DiscountCalcPercentage(double amountOff) throws RuntimeException {
        this.amountOff = amountOff;
    }

    private final double getAmountOff() {
        return amountOff;
    }

    private final void setAmountOff(double amountOff) throws RuntimeException {
        if (amountOff > 0) {
            this.amountOff = amountOff;
        } else {
            throw new IllegalArgumentException("Amount off cannot be less than 0");
        }
    }

    @Override
    public final double calculateAndReturnSavings(double price, int quantity) {
        if (price > 0 && quantity > 0) {
            return (price * quantity) * (getAmountOff() * .01);
        } else {
            throw new IllegalArgumentException("price and quantity do not take a numeric value less than 0");
        }
    }
}
