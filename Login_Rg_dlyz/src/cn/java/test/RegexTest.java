package cn.java.test;

public class RegexTest {
	public static void main(String[] args){
		String data ="1";//给定一个非数字
		String regex ="\\D";//非数字
		boolean flag = data.matches(regex);
		//System.out.println(flag);
		
		String data2 = "abc";
		String regex2 = "\\s";//空白字符
		boolean flag2  = data2.matches(regex2);
		//System.out.println(flag2);
		
		String data3 = " ";
		String regex3 = "\\S";//非空白字符
		boolean flag3 = data3.matches(regex3);
		//System.out.println(flag3);
		
		String data4 = "a";
		String regex4 = "\\w";//单词字符[a-zA-Z_0-9]
		boolean flag4 = data4.matches(regex4);
		//System.out.println(flag4);
		
		String data5 = "%";
		String regex5 = "^\\W$";//非单词字符[a-zA-Z_0-9](^、$代表的是正则的起始与结束标记，可以省略不写)
		boolean flag5 = data5.matches(regex5);
		System.out.println(flag5);
	}
}
