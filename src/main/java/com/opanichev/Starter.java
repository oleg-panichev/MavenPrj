package com.opanichev;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * Created by Oleg on 15.02.14.
 */
public class Starter {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Person p=new Person();
        p.setName("Oleg");
        p.setAddress("Kiev");

        JAXBContext jc=JAXBContext.newInstance(Person.class);
        Marshaller m=jc.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        //OutputStream out=new OutputStream(new File("Test.xml"));
        m.marshal(p,System.out);

        Unmarshaller um=jc.createUnmarshaller();

        String addr="D:\\Dropbox\\Java\\MavenPrj\\src\\main\\resources\\com\\opanichev\\Test.xml";
        //InputStream stream=ClassLoader.getSystemClassLoader().getResourceAsStream(addr);
        InputStream stream=new FileInputStream(addr);

        Person pp=(Person)um.unmarshal(stream);

        System.out.println("person "+pp.getName()+" from "+pp.getAddress());
    }
}
