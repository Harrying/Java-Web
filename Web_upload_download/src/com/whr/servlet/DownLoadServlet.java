package com.whr.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String path;
	
	@Override
	public void init() throws ServletException {
		//在web.xml中把path值传过来
		path = getServletConfig().getInitParameter("path");
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		// 获得用户需要下载文件的名字
		String fileName = request.getParameter("fileName");

		// 下载文件所在目录的绝对路径
		String realPath = getServletContext().getRealPath(path);

		// 设置为下载application/x-download
		response.setContentType("application/x-download");
		
		// 下载文件时显示的文件保存名称
		String fileDisplay = "briup_"+fileName;
		// 中文编码转换
		fileDisplay = URLEncoder.encode(fileDisplay, "UTF-8");
		
		//设置响应头部信息
		response.addHeader("Content-Disposition", "attachment;filename="+fileDisplay);
		try {
			ServletOutputStream out = response.getOutputStream();
			File file = new File(realPath,fileName);
			FileInputStream in = new FileInputStream(file);
			byte[] b = new byte[1024];
			int len = -1;
			while ((len = in.read(b)) != -1) {
				out.write(b, 0, len);
			}
			out.flush();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//注意下载之后就不能使用request跳转了,因为response已经返回了
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
