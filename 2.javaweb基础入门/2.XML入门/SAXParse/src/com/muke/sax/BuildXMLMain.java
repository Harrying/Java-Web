package com.muke.sax;

import java.io.File;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.helpers.AttributesImpl;

public class BuildXMLMain {

	public static void main(String[] args) throws Exception {
		//��������XML�Ľ��������
		Result resultXML=new StreamResult(new File("D://firstxml1.xml"));
		//��ȡsax���ɹ���ʵ��
		SAXTransformerFactory saxTransformerFactory=(SAXTransformerFactory) SAXTransformerFactory.newInstance();
		//��ȡSAX���ɴ����߶���ʵ��
		TransformerHandler transformerHandler=saxTransformerFactory.newTransformerHandler();
		transformerHandler.setResult(resultXML);
		//��ȡSAX������
		Transformer transformer=transformerHandler.getTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		//�����ĵ��Ŀ�ʼ
		transformerHandler.startDocument();
		AttributesImpl attrImpl=new AttributesImpl();
		transformerHandler.startElement("", "", "�鼮�б�", attrImpl);
		
		transformerHandler.startElement("", "", "������鼮", attrImpl);
		transformerHandler.startElement("", "", "����", attrImpl);
		transformerHandler.characters("Java˼��".toCharArray(), 0, "Java˼��".length());
		transformerHandler.endElement("", "", "����");
		
		transformerHandler.startElement("", "", "����", attrImpl);
		transformerHandler.characters("С��".toCharArray(), 0, "С��".length());
		transformerHandler.endElement("", "", "����");
		
		transformerHandler.startElement("", "", "�۸�", attrImpl);
		transformerHandler.characters("79.00".toCharArray(), 0, "79.00".length());
		transformerHandler.endElement("", "", "�۸�");
		transformerHandler.endElement("", "", "������鼮");
		
		//�ڶ�����
		
		transformerHandler.startElement("", "", "������鼮", attrImpl);
		transformerHandler.startElement("", "", "����", attrImpl);
		transformerHandler.characters("Springָ��".toCharArray(), 0, "Springָ��".length());
		transformerHandler.endElement("", "", "����");
		
		transformerHandler.startElement("", "", "����", attrImpl);
		transformerHandler.characters("С��".toCharArray(), 0, "С��".length());
		transformerHandler.endElement("", "", "����");
		
		transformerHandler.startElement("", "", "�۸�", attrImpl);
		transformerHandler.characters("89.00".toCharArray(), 0, "89.00".length());
		transformerHandler.endElement("", "", "�۸�");
		transformerHandler.endElement("", "", "������鼮");
		
		transformerHandler.endElement("", "", "�鼮�б�");
		//����handler�ĵ������ѽ���
		transformerHandler.endDocument();
		
		System.out.println("XML�ĵ����ɳɹ�!");
	}

}
