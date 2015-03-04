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
public interface DatabaseStrategy {
    
    public abstract ProductStrategy findProductViaUpcAndReturnProduct(int upc);

    public abstract DatabaseCustomerStrategy findCustomerAndReturnCustomer(String customerId);
    
}
