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
public class AnonymousCustomer implements DatabaseCustomerStrategy {

    String name = "Anonymous Customer";
    String customerId = "00000000";

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

}
