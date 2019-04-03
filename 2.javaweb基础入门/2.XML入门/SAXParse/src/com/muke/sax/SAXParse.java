package com.muke.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.muke.sax.handler.MuKeHandler;

public class SAXParse {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//创建SAX解析器工厂
		SAXParserFactory factory= SAXParserFactory.newInstance();
		//创建SAX解析器
		SAXParser parser= factory.newSAXParser();
		//开始解析XML文档
		parser.parse("D://firstxml.xml", new MuKeHandler());
	}

}
