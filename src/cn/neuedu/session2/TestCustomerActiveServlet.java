package cn.neuedu.session2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestCustomerActiveServlet extends HttpServlet {
	/**
	 * 启动服务器，在浏览器中写地址，在控制台会出现customer放到session中了
	 * 然后关闭tomcat控制台就会出现对象 被钝化了，在启动tomcat就会出现对象被活化了
	 * 
	 * 但钝化和活化不能手动进行，要写一个配置文件来控制钝化和活化
	 * 在WEB-INF下建一个xml文件，只能在这里建，别的地方读不到
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        //获得Session
				HttpSession session=request.getSession();
		        //创建一个Customer
				Customer customer=new Customer();
				customer.setId(100);
				customer.setName("zhuzhu");
				//将Customer对象放到Session中
				session.setAttribute("Customer", customer);
				System.out.println("customer放到session中了");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
