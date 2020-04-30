package module8;
import javax.xml.parsers.*;

import org.w3c.dom.*;
import java.io.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
public class create_dom {

	public static void main(String[] args) {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = null;
		try {
			b = f.newDocumentBuilder();
		}
		catch(ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		Document doc = b.newDocument();
		
		Element rootele = doc.createElement("employees");
		Element employeeele = doc.createElement("employee");
		Element idele = doc.createElement("id");
		Element nameele = doc.createElement("name");
		Element genderele = doc.createElement("gender");
		Element salaryele = doc.createElement("salary");
		Element addressele = doc.createElement("address");
		
		Text t1 = doc.createTextNode("101");
		Text t2 = doc.createTextNode("Chandrika Deb");
		Text t3 = doc.createTextNode("Femle");
		Text t4 = doc.createTextNode("600000");
		Text t5 = doc.createTextNode("Jamshedpur,Jharkhand");
		
		idele.appendChild(t1);
		nameele.appendChild(t2);
		genderele.appendChild(t3);
		salaryele.appendChild(t4);
		addressele.appendChild(t5);
		
		employeeele.appendChild(idele);
		employeeele.appendChild(nameele);
		employeeele.appendChild(genderele);
		employeeele.appendChild(salaryele);
		employeeele.appendChild(addressele);
		
		rootele.appendChild(employeeele);
		doc.appendChild(rootele);
		Transformer t = null;
		
		try {
			t = TransformerFactory.newInstance().newTransformer();
		}	catch(TransformerConfigurationException e1) {
			e1.printStackTrace();
		}	catch(TransformerFactoryConfigurationError e1) {
			e1.printStackTrace();
		}
		
		try {
			t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream("employees.xml")));
		}	catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
		System.out.println("XML File generated successfully");
	}

}
