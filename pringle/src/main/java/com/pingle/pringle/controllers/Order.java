package com.pingle.pringle.controllers;

import org.springframework.stereotype.Component;

@Component
public class Order {

    private Order(){

    }

    private Order(int a){

    }
    double show;

    public String getOrders(Integer customerId){
        return "Hello autowired";
    }

    public static void show(int a, int b){}

    public static void show(double a, int b){}

}
