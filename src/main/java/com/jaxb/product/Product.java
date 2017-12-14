package com.jaxb.product;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    private String name;

    public String getName() {
        return name;
    }

    public void printProductName() {
        System.out.println("Product Name: " + name);
    }
}