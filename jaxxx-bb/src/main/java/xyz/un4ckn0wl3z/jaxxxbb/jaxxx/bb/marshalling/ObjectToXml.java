package xyz.un4ckn0wl3z.jaxxxbb.jaxxx.bb.marshalling;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class ObjectToXml {

	public static void main(String[] args) throws Exception {
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Employee emp1 = new Employee(1,"ANUWXA",99999);
		
		marshaller.marshal(emp1, new FileOutputStream("employee.xml"));

	}

}
