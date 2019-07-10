package com.whr.db;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.regexp.internal.recompile;
import com.whr.bean.Emp;

public class DBUtil {
	public static Map<String, Emp> map = new HashMap<String,Emp>();
	static {
		map.put("101", new Emp("101", "AA", "123456", "AA@123.com"));
		map.put("102", new Emp("102", "BB", "123456", "BB@123.com"));
		map.put("103", new Emp("103", "CC", "123456", "CC@123.com"));
		map.put("104", new Emp("104", "DD", "123456", "DD@123.com"));
	}
	
	//判断用户名和密码是否正确
	public static boolean selectEmpByAccountAngPassword(Emp emp) {
		boolean flag = false;
		for (String key  : map.keySet()) {
			Emp e = map.get(key);
			if(emp.getAccount().equals(e.getAccount())&& emp.getPassword().equals(e.getPassword())) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
