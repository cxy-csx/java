package com.cxy.csx;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class NewsPaperOffice {
    List<Customer> customers;

    private void notifyAllCustomer(){
        for (Customer customer : customers) {
            customer.sub();
        }
    }

    public void newsPaper(){
        this.notifyAllCustomer();
    }

}
