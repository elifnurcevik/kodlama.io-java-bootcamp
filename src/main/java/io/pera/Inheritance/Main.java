package io.pera.Inheritance;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer elif = new IndividualCustomer();
        elif.customerNumber = "1234";

        CorporateCustomer pera = new CorporateCustomer();
        pera.customerNumber = "6789";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {elif, pera};

        customerManager.addMultiple(customers);

    }

}

// OUTPUT
/*

1234 saved!
6789 saved!

 */
