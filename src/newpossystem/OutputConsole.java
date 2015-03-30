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
        if (receiptText != null || receiptText.isEmpty() == false) {
            System.out.println(receiptText);
        } else {
            throw new IllegalReceiptTextException("Can not output a receipt with a null or empty string");
        }
    }

    @Override
    public void outputErrorMessage(String errorMessage) throws RuntimeException {
        if (errorMessage != null || errorMessage.isEmpty() == false) {
            System.out.println(errorMessage);
        } else {
            throw new IllegalErrorMessageException("Can not output an error message with a null or empty string");
        }
    }

}
