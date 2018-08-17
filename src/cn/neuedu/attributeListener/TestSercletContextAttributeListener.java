package cn.neuedu.attributeListener;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestSercletContextAttributeListener extends HttpServlet {
	/**
	 * 测试类，测试属性监听的
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得对象
		//点ctrl+2会出现返回值的选项，选择需要的
		 ServletContext context = this.getServletContext();
		
		//向context域中存数据(将名字为tom的对象存入)
		 context.setAttribute("name", "tom");
		
		//改context域中数据(将tom改成lucy)
		 context.setAttribute("name", "lucy");
		
		//删除context域中数据(删除名字)
		 context.removeAttribute("name");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
