package com.cxy.csx;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CustomerA customerA = new CustomerA();
        CustomerB customerB = new CustomerB();

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customerA);
        customers.add(customerB);

        NewsPaperOffice newsPaperOffice = new NewsPaperOffice();
        newsPaperOffice.setCustomers(customers);

        newsPaperOffice.newsPaper();


    }
}
