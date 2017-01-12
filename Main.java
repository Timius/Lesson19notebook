import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.01.2017.
 */
public class Main {
    public static void main(String[] args)
            throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory =
                SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        String path = "src\\Laptop.tld";
        DefaultHandler handler = new MyHandler();
        saxParser.parse(path, handler);

        System.out.println();
    }
    public static class MyHandler extends DefaultHandler {
        Specifications buff = null;
        List<Specifications> specifications = new ArrayList();
        StringBuilder sb = new StringBuilder();

        @Override
        public void startElement(String uri, String localName, String qName,
                                 Attributes attributes) throws SAXException {
            String out = "START " + qName + " " + attributes.getLength();
            System.out.println(out);
            sb = new StringBuilder();

            if(qName.equals("specifications")) {
                buff = new Specifications();
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            char[] result = new char[length];
            for(int i = 0; i < length; i++) {
                result[i] = ch[start + i];
            }
            String str = new String(result);
            sb.append(str);
        }

        @Override
        public void endElement(String uri, String localName,
                               String qName) throws SAXException {
            if(qName.equalsIgnoreCase("name")) {
                buff.setName(sb.toString());
            }
            if(qName.equalsIgnoreCase("type")) {
                buff.setType(sb.toString());
            }
            if(qName.equals("specifications")) {
                specifications.add(buff);
            }

            System.out.println("VALUE " + sb.toString().trim());
            sb = new StringBuilder();
            String out = "END " + qName;
            System.out.println(out);
        }



}
}
