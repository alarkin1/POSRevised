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
        this.receiptOutputMechanism = receiptOutputMechanism;
    }

    public final void beginSale(String customerId, DatabaseStrategy newDatabase, double salesTaxRatePerc) {
        newVirtualReceipt = new VirtualReceipt(customerId, newDatabase, salesTaxRatePerc);
    }

    public final void endSale() {
        newVirtualReceipt.generateReceipt();
        receiptOutputMechanism.outputReceipt(newVirtualReceipt.returnReceiptText());
    }

    public final void addItemToReceipt(int upc, int quantity) {
        newVirtualReceipt.addLineItemToReceipt(upc, quantity);
    }

}
