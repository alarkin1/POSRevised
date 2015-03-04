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
public interface DiscountCalcStrategy {
    public abstract double calculateAndReturnSavings(double price, int quantity);
}
