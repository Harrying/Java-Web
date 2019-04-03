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
		//创建保存XML的结果流对象
		Result resultXML=new StreamResult(new File("D://firstxml1.xml"));
		//获取sax生成工厂实例
		SAXTransformerFactory saxTransformerFactory=(SAXTransformerFactory) SAXTransformerFactory.newInstance();
		//获取SAX生成处理者对象实例
		TransformerHandler transformerHandler=saxTransformerFactory.newTransformerHandler();
		transformerHandler.setResult(resultXML);
		//获取SAX生成器
		Transformer transformer=transformerHandler.getTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		//生成文档的开始
		transformerHandler.startDocument();
		AttributesImpl attrImpl=new AttributesImpl();
		transformerHandler.startElement("", "", "书籍列表", attrImpl);
		
		transformerHandler.startElement("", "", "计算机书籍", attrImpl);
		transformerHandler.startElement("", "", "书名", attrImpl);
		transformerHandler.characters("Java思想".toCharArray(), 0, "Java思想".length());
		transformerHandler.endElement("", "", "书名");
		
		transformerHandler.startElement("", "", "作者", attrImpl);
		transformerHandler.characters("小王".toCharArray(), 0, "小王".length());
		transformerHandler.endElement("", "", "作者");
		
		transformerHandler.startElement("", "", "价格", attrImpl);
		transformerHandler.characters("79.00".toCharArray(), 0, "79.00".length());
		transformerHandler.endElement("", "", "价格");
		transformerHandler.endElement("", "", "计算机书籍");
		
		//第二本书
		
		transformerHandler.startElement("", "", "计算机书籍", attrImpl);
		transformerHandler.startElement("", "", "书名", attrImpl);
		transformerHandler.characters("Spring指南".toCharArray(), 0, "Spring指南".length());
		transformerHandler.endElement("", "", "书名");
		
		transformerHandler.startElement("", "", "作者", attrImpl);
		transformerHandler.characters("小李".toCharArray(), 0, "小李".length());
		transformerHandler.endElement("", "", "作者");
		
		transformerHandler.startElement("", "", "价格", attrImpl);
		transformerHandler.characters("89.00".toCharArray(), 0, "89.00".length());
		transformerHandler.endElement("", "", "价格");
		transformerHandler.endElement("", "", "计算机书籍");
		
		transformerHandler.endElement("", "", "书籍列表");
		//告诉handler文档生成已结束
		transformerHandler.endDocument();
		
		System.out.println("XML文档生成成功!");
	}

}
