package com.dio;

import com.dio.base.Order;

public class HelloJava {

    public static void main(String[] args) {

        System.out.println("\nHello Java, I'm Talking to you!!!\n");

        Order order = new Order("code1234");

        System.out.println(order);

    }

}