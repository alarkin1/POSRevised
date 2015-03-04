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

    
    
    public DiscountCalcFlat(double amountOff) {
        this.amountOff = amountOff;
    }   
    @Override
    public double calculateAndReturnSavings(double price, int quantity) {
        return amountOff;
    }   
}