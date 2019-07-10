package com.whr.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class JSTL_foreach_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1、首先创建一个List集合，我们往这个List集合中存放多条数据
				Map<String,Object> datamap1=new HashMap<String,Object>();
				datamap1.put("shopName", "联想笔记本");
				datamap1.put("address", "北京");
				datamap1.put("price", 4999.99);
				Map<String,Object> datamap2=new HashMap<String,Object>();
				datamap2.put("shopName", "神州笔记本");   
				datamap2.put("address", "南京");
				datamap2.put("price", 3999.99);
				List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
				lists.add(datamap1);
				lists.add(datamap2);
				//2、将存在多条数据的List集合保存到request域中去
				request.setAttribute("lists", lists);
				//3、我们再将5.jsp中取出request域中存放的list集合
				request.getRequestDispatcher("/JSTL_for_each.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
