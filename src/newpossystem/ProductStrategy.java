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
public interface ProductStrategy {
    public abstract DiscountStrategy getDiscountStrategy();
    public abstract String getProductName();
    public abstract int getUpc();
    public abstract double getPrice();
}
