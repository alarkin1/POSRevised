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
        JOptionPane.showMessageDialog(null, receiptText);
    }

    @Override
    public void outputErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage);
    }

}
