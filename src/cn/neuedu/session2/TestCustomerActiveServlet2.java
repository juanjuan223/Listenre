package cn.neuedu.session2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestCustomerActiveServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��session���л�ȡ����
		
		//���session
		HttpSession session=request.getSession();
		//��session���л�ȡ����
		Customer customer = (Customer) session.getAttribute("customer");
		System.out.println(customer.getName());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
