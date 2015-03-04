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
public class DatabaseFakeSimple implements DatabaseStrategy{

    private ProductStrategy[] tableOfProducts = {
        new PackerBallCap(new DiscountByProduct(new DiscountCalcFlat(10.0)), 20.0),
        new PackerTShirt(new DiscountByProduct(new DiscountCalcFlat(5.0)), 50.0)
    };
    private DatabaseCustomerStrategy[] tableOfCustomers = {new RecordedCustomer("Bob The Fantastic", "BOB-123")};

    public DatabaseFakeSimple() {
        
    }

    public ProductStrategy findProductViaUpcAndReturnProduct(int upc) {
        for (ProductStrategy product : tableOfProducts) {
            if (product.getUpc() == upc) {
                return product;
            }
        }
        System.out.println("Error: That item doesn't exist in the database!");
        return null;
    }

    public DatabaseCustomerStrategy findCustomerAndReturnCustomer(String customerId) {
        for (DatabaseCustomerStrategy databaseCustomer : tableOfCustomers) {
            if (databaseCustomer.getCustomerId() == customerId) {
                return databaseCustomer;
            }
        }
        System.out.println("Error: That customer doesn't exist in the database!");
        return new AnonymousCustomer();
    }

}
