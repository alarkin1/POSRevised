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
public class InvalidCustomerIdException extends RuntimeException{

    public InvalidCustomerIdException(String message) {
        super(message);
    }
    
}
