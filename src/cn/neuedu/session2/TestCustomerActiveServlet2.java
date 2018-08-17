package cn.neuedu.session2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestCustomerActiveServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//从session域中获取对象
		
		//获得session
		HttpSession session=request.getSession();
		//从session域中获取对象
		Customer customer = (Customer) session.getAttribute("customer");
		System.out.println(customer.getName());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
