package com.muke.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.muke.sax.handler.MuKeHandler;

public class SAXParse {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//����SAX����������
		SAXParserFactory factory= SAXParserFactory.newInstance();
		//����SAX������
		SAXParser parser= factory.newSAXParser();
		//��ʼ����XML�ĵ�
		parser.parse("D://firstxml.xml", new MuKeHandler());
	}

}
