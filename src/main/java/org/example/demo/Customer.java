package org.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
//Autowired using parametrized Constructor
public class Customer {
    private Register register;
@Autowired
    public Customer(Register register) {
        this.register = register;
    }

    public void registerAccount(){
        if (register.registerToAccount()){
            System.out.println("Customer registered !!");
        } else {
            System.out.println("Customer not registered ");
        }

    }
}

