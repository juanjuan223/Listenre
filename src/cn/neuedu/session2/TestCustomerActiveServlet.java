package cn.neuedu.session2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestCustomerActiveServlet extends HttpServlet {
	/**
	 * ���������������������д��ַ���ڿ���̨�����customer�ŵ�session����
	 * Ȼ��ر�tomcat����̨�ͻ���ֶ��� ���ۻ��ˣ�������tomcat�ͻ���ֶ��󱻻��
	 * 
	 * ���ۻ��ͻ�����ֶ����У�Ҫдһ�������ļ������ƶۻ��ͻ
	 * ��WEB-INF�½�һ��xml�ļ���ֻ�������ｨ����ĵط�������
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        //���Session
				HttpSession session=request.getSession();
		        //����һ��Customer
				Customer customer=new Customer();
				customer.setId(100);
				customer.setName("zhuzhu");
				//��Customer����ŵ�Session��
				session.setAttribute("Customer", customer);
				System.out.println("customer�ŵ�session����");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
