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
public class OutputConsole implements OutputStrategy {

    @Override
    public void outputReceipt(String receiptText) {
        System.out.println(receiptText);
    }

    @Override
    public void outputErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

}
