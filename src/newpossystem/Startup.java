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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister newCashRegister = new CashRegister(new OutputConsole());
        newCashRegister.beginSale("BOB-123", new DatabaseFakeSimple(),3);
        newCashRegister.addItemToReceipt(98932, 2);
        newCashRegister.endSale();
    }
    
}
