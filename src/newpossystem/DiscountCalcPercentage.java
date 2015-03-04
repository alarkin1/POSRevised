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

    public DiscountCalcPercentage(double amountOff) {
        this.amountOff = amountOff;
    }

    public double getAmountOff() {
        return amountOff;
    }

    public void setAmountOff(double amountOff) {
        this.amountOff = amountOff;
    }
    
    
    //calls twice becduase the LineItem calls this method once and then calculateAndReturnSavings calls it also
    @Override
    public double calculateAndReturnSavings(double price, int quantity) {
        return (price * quantity) * (amountOff * .01);
    }

//    @Override
//    public double calculateAndReturnDiscountedPrice(double price, int quantity) {
//        return ((price * quantity) - calculateAndReturnSavings(price, quantity));
//    }
    
    

}
