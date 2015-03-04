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
public class VirtualReceipt {

    private String receiptText;
    private DatabaseStrategy db;
    private LineItem[] listOfLineItems;
    private DatabaseCustomerStrategy customer;
    private double subtotal;
    private double totalSaved;
    private double salesTaxRatePerc;

    public VirtualReceipt(String customerId, DatabaseStrategy db, double salesTaxRatePerc) {
        listOfLineItems = new LineItem[0];
        this.salesTaxRatePerc = salesTaxRatePerc; 
        this.db = db;
        customer = this.db.findCustomerAndReturnCustomer(customerId);
    }

    public final void generateReceipt() {
        createReceiptHeader();
        calculateAndBuildReceiptBody();
        buildReceiptFooter();
    }

    public final String returnReceiptText() {
        return receiptText;
    }

    private void createReceiptHeader() {
        receiptText += "Thank you for shopping at Kohls, " + customer.getName() + "\n";
        receiptText += "------------------------------------------------------\n";
        receiptText += "Product Name, Product Id, Qty, Discounted Price\n";
        receiptText += "------------------------------------------------------\n";
    }

    private void calculateAndBuildReceiptBody() {

        for (LineItem lineItem : listOfLineItems) {
            String productName = lineItem.getLineItemName();
            int upc = lineItem.getUpc();
            double discountedPrice = lineItem.calculateAndReturnDiscountedPrice();
            double itemSavings = lineItem.calculateAndReturnSavings();
            double itemPrice = lineItem.getItemPrice();
            totalSaved += itemSavings;
            subtotal += discountedPrice;
            receiptText += productName + " | " + upc + " | " + lineItem.getQuantity() + " | $" + discountedPrice + " | \n";
            receiptText += "--Item Price: $" + itemPrice + "-------You Save: $" + itemSavings + "\n";
            receiptText += "______________________________________________________\n";
        }
    }

    private void buildReceiptFooter() {
        double salesTaxAmount = (subtotal * (salesTaxRatePerc / 100));
        receiptText += "------------------------------------------------------\n";
        receiptText += "Subtotal: $" + subtotal + "\n";
        receiptText += "$" + subtotal + " @ " + salesTaxRatePerc + "%  Tax:   $" + salesTaxAmount + "\n";
        receiptText += "TOTAL:  $" + (subtotal + salesTaxAmount) + "\n\n\n";
        receiptText += "TOTAL SAVED:        $" + (totalSaved - salesTaxAmount) + "\n";
    }

    public final void addLineItemToReceipt(int upc, int quantity) {
        LineItem[] temp = new LineItem[listOfLineItems.length + 1];
        System.arraycopy(listOfLineItems, 0, temp, 0, listOfLineItems.length);
        LineItem lineItemToAdd = new LineItem(db.findProductViaUpcAndReturnProduct(upc), quantity);
        if (lineItemToAdd.getItemPrice() != 0 && lineItemToAdd.getLineItemName() != null) {
            temp[listOfLineItems.length] = lineItemToAdd;
            listOfLineItems = temp;
            temp = null;
            lineItemToAdd = null;
        }
    }
}
