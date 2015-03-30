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
public class CashRegister {

    private VirtualReceipt newVirtualReceipt;
    private OutputStrategy receiptOutputMechanism;

    public CashRegister(OutputStrategy receiptOutputMechanism) {
        if (receiptOutputMechanism == null) {
            receiptOutputMechanism.outputErrorMessage(GlobalErrorMessages.illegalReceiptOutputterErrorMessage);
            System.exit(0);
        } else {
            this.receiptOutputMechanism = receiptOutputMechanism;
        }
    }

    public final void beginSale(String customerId, DatabaseStrategy newDatabase, double salesTaxRatePerc) {
        try {
            newVirtualReceipt = new VirtualReceipt(customerId, newDatabase, salesTaxRatePerc);
        } catch (RuntimeException re) {
            receiptOutputMechanism.outputErrorMessage(re.getMessage());
        }
    }

    public final void endSale() {
        newVirtualReceipt.generateReceipt();
        receiptOutputMechanism.outputReceipt(newVirtualReceipt.returnReceiptText());
    }

    public final void addItemToReceipt(int upc, int quantity) {
        try {
            newVirtualReceipt.addLineItemToReceipt(upc, quantity);
        } catch (RuntimeException re) {
            receiptOutputMechanism.outputErrorMessage(re.getMessage());
        }
    }
}