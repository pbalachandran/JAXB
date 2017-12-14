package com.jaxb.customer;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

    private String name;
    private Address address;

}