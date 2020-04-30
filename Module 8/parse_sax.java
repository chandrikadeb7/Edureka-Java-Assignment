package module8;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;


public class parse_sax extends DefaultHandler{
	public void startDocument() {
		System.out.println("Document begins here");
	}
	 public void startElement(String uri, String localName, String qName, Attributes attributes) {
		 System.out.println("<"+qName+">");
	 }
	 public void characters(char[] ch, int start, int length) {
		 System.out.println(new String(ch,start,length));
	 }
	 public void endElement(String uri,String localName, String qName) {
		 System.out.println("</"+qName+">");
	 }
	 public void endDocument() {
		 System.out.println("Document ends here");
	 }
	 
	 public static void main(String[] args) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
		 SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		 p.parse(new FileInputStream("employees.xml"),new parse_sax());
	 }
}
