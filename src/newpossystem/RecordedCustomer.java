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
public class RecordedCustomer implements DatabaseCustomerStrategy {

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

    public void setName(String name) throws RuntimeException {
        if (name != null || name.isEmpty() == false || (name.length() > 0 && name.length() < 20)) {
            this.name = name;
        } else {
            throw new InvalidNameException("Invalid name has been passed in.  Rules: Not null, Not empty string, Longer than 0 characters, Less than 20 characters");
        }
    }

    public void setCustomerId(String customerId) {
        if (customerId != null || customerId.isEmpty() == false || (customerId.length() > 0 && customerId.length() <= 7)) {
            this.customerId = customerId;
        }else {
            throw new InvalidCustomerIdException("Invalid name has been passed in.  Rules: Not null, Not empty string, Longer than 0 characters, Less than or equal to 7 characters");
        }
    }

}
