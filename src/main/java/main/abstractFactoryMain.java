package main;

import logging.ConsoleLogger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class abstractFactoryMain {
    public static void main(String[] args) throws ParserConfigurationException {
        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = null;
        try {
            doc = factory.parse(bais);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doc.getDocumentElement().normalize();
        ConsoleLogger.writeInfo("Root: "+doc.getDocumentElement().getNodeName());
        ConsoleLogger.writeInfo(abstractFactory.getClass().toString());
        ConsoleLogger.writeInfo(factory.getClass().toString());

    }
}
