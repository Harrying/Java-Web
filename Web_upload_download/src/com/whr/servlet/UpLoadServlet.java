package com.whr.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UpLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String path;
	
	@Override
	public void init() throws ServletException {
		//在web.xml中把path值传过来
		path = getServletConfig().getInitParameter("path");
	}
	
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//获得上传目录的绝对路径
		String realpath = this.getServletContext().getRealPath(path);
		System.out.println(realpath);
		
		try {
			//构造一个文件上传处理对象
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upLoad = new ServletFileUpload(factory);
			
			//获得表单中提交内容
			List<FileItem> list = upLoad.parseRequest(request);

			for (FileItem fileItem : list) {
				//fileItem.isFormField()返回true表示是普通的表单组件
				//fileItem.isFormField()返回false表示是上传
				if (fileItem.isFormField()) {
					// getName()方法返回的是文件名字 普通表单组件有文件，返回NULL
					String FieldName = fileItem.getFieldName();
					System.out.println(FieldName);
					String Content = fileItem.getString("UTF-8");
					System.out.println(Content);
					//为了后面可以把普通参数从request中拿出来
					request.setAttribute(FieldName, Content);
				} else {
					//取得上传文件的名字
					String fileName = fileItem.getName();
					System.out.println(fileName);
					//避免文件名字重复
					fileName = System.currentTimeMillis()+fileName;
					System.out.println(fileName);
					File file = new File(realpath, fileName);
					//把上传文件进行指定目录
					fileItem.write(file);
				}
			}
			System.out.println("request.getAttribute(\"username\") = "+request.getAttribute("username"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

