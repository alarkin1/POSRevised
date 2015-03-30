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
public class DiscountCalcFlat implements DiscountCalcStrategy {

    private double amountOff = 1;

    public final void setAmountOff(double amountOff) throws RuntimeException {
        if (amountOff > 0) {
            this.amountOff = amountOff;
        } else {
            throw new IllegalArgumentException("Amount off cannot be less than 0");
        }
    }

    public final double getAmountOff() {
        return amountOff;
    }

    public DiscountCalcFlat(double amountOff) {
        setAmountOff(amountOff);
    }

    @Override
    public double calculateAndReturnSavings(double price, int quantity) {
        if (price > 0 && quantity > 0) {
            return getAmountOff();
        } else {
            throw new IllegalArgumentException("price and quantity do not take a numeric value less than 0");
        }
    }
}
