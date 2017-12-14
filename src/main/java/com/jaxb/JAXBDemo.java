package com.jaxb;

import com.jaxb.message.Message;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBDemo {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Message.class);

        System.out.println("*****************Customer****************************");

        Unmarshaller unmarshallerForCustomer = jc.createUnmarshaller();
        File file1 = new File("input-customer.xml");
        Message message1 = (Message) unmarshallerForCustomer.unmarshal(file1);

        Marshaller marshallerForCustomer = jc.createMarshaller();
        marshallerForCustomer.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerForCustomer.marshal(message1, System.out);

        System.out.println("*****************Product****************************");

        Unmarshaller unmarshallerForProduct = jc.createUnmarshaller();
        File file2 = new File("input-product.xml");
        Message message2 = (Message) unmarshallerForProduct.unmarshal(file2);

        Marshaller marshallerForProduct = jc.createMarshaller();
        marshallerForProduct.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerForProduct.marshal(message2, System.out);
    }
}
