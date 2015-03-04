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
public class RecordedCustomer implements DatabaseCustomerStrategy{
    String name;
    String customerId;
    public RecordedCustomer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCustomerId() {
        return customerId;
    }
    
}
