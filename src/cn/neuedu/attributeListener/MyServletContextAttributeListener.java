package cn.neuedu.attributeListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener{

	@Override
	/**
	 * 后面的两个域和这个方法是一样的
	 * 
	 * 有3部  1.写类   2.在web里配置类 3.建一个测试的类（jsp或者servlet都可以，用的是servlet）
	 */
	public void attributeAdded(ServletContextAttributeEvent sab){
		//放到域中的属性
	   System.out.println("获取放到域中的name是"+sab.getName());//获取放到域中的name
	   System.out.println("获取放到域中的value是"+sab.getValue());//获取放到域中的value
	   
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent sab) {
		
	   System.out.println("获取删除域中的名字是"+sab.getName());//获取删除域中的名字
	   System.out.println("获取删除域中的value是"+sab.getValue());//获取删除域中的value
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent sab) {
		 System.out.println("获取修改前的name是"+sab.getName());//获取修改前的name
		 System.out.println("获取修改前的值是"+sab.getValue());//获取修改前的值
		
	}

}
