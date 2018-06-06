package xyz.un4ckn0wl3z.jaxxxbb.jaxxx.bb.unmarshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import xyz.un4ckn0wl3z.jaxxxbb.jaxxx.bb.marshalling.Employee;

public class XMLToObject {

	public static void main(String[] args) {
		
		try {
			File file = new File("employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Employee e = (Employee) unmarshaller.unmarshal(file);
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());  
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
