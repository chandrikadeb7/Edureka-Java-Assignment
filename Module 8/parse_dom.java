package module8;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class parse_dom {
	public static void main(String[] args) {
		try {
			File fXmlfile = new File("employees.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlfile);
			
			System.out.println("Root element :"+doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("employee");
			System.out.println("----------------------------------"+nList.getLength());
			
			for(int temp=0;temp<nList.getLength();temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :"+nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					
					Element eElement = (Element) nNode;
					System.out.println("ID of Employee : "+eElement.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("Name of Employee : "+eElement.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("Gender of Employee : "+eElement.getElementsByTagName("gender").item(0).getTextContent());
					System.out.println("Salary of Employee : "+eElement.getElementsByTagName("salary").item(0).getTextContent());
					System.out.println("Address of Employee : "+eElement.getElementsByTagName("address").item(0).getTextContent());
				}
			}
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
}
