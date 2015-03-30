/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpossystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class OutputGUI implements OutputStrategy {

    @Override
    public void outputReceipt(String receiptText) {
        if (receiptText != null || receiptText.isEmpty() == false) {
            JOptionPane.showMessageDialog(null, receiptText);
        } else {
            throw new IllegalReceiptTextException("Can not output a receipt with a null or empty string");
        }
    }

    @Override
    public void outputErrorMessage(String errorMessage) {
        if (errorMessage != null || errorMessage.isEmpty() == false) {
            JOptionPane.showMessageDialog(null, errorMessage);
        } else {
            throw new IllegalErrorMessageException("Can not output an error message with a null or empty string");
        }
    }

}
