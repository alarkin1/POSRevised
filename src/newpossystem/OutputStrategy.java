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
public interface OutputStrategy {
    public abstract void outputReceipt(String receiptText);
    public abstract void outputErrorMessage(String errorMessage);
}
