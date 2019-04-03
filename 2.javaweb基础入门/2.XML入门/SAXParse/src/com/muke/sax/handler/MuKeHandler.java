package com.muke.sax.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MuKeHandler extends DefaultHandler {
	//����һ�����������浱ǰ���ڴ����tag
	private String currentTag;
	//ÿ�������ı�����ʱ�������÷���
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		 String content=new String(ch,start,length);
		 if (content.trim().length()>0) {
			System.out.println("<"+currentTag+">Ԫ�ص�ֵ��:"+content.trim());
		}
	}
	//�����ĵ�����ʱ�����÷���
	@Override
	public void endDocument() throws SAXException {
		System.out.println("�����ĵ�����");
	}
	//����Ԫ�ؽ���ʱ�����÷���
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("����Ԫ�ؽ���:"+qName);
	}
	//ÿ�������ĵ���ʼʱ�����÷���
	@Override
	public void startDocument() throws SAXException {
		System.out.println("�����ĵ���ʼ");
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("��ʼ����Ԫ��:"+qName);
		currentTag=qName;
		if (attributes.getLength()>0) {
			System.out.println("<"+currentTag+">Ԫ�ص���������:");
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println(attributes.getQName(i)+"--->"+attributes.getValue(i));
			}
		}
	}
	
}
