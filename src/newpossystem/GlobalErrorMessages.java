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
public class GlobalErrorMessages {

    public static String illegalCustomerIdErrorMessage = "An invalid customerId has been entered!";
    public static String illegalDatabaseErrorMessage = "An invalid db has been passed in!";
    public static String illegalSalesTaxRatePercErrorMessage = "An invalid db has been passed in!";
    public static String illegalUpcErrorMessage = "An invalid upc has been passed in!";
    public static String illegalQuantityErrorMessage = "An invalid quantity has been passed in!";
    public static String illegalReceiptOutputterErrorMessage = "An invalid receiptOutputter has been passed in!";
    public static int maxCustomerIdLength = 13;
    public static int minCustomerIdLength = 5;
    public static int minSalesTaxRatePerc = 0;
    public static int maxSalesTaxRatePerc = 12;
    public static int minUpc = 1;
    public static int maxUpc = 99999999;
    public static int minQuantity = 0;
    public static int maxQuantity = 200;
    public static String customerIdDelim = "-";
}
