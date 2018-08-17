package cn.neuedu.session1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestPersonBindingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //���Session
		HttpSession session=request.getSession();
        //����һ��person
		Person p=new Person();
		p.setId(100);
		p.setName("zhuzhu");
		//��person�����Session��
		session.setAttribute("person", p);
		System.out.println("person�ŵ�session����");
		
		
		//���person�����session�Ƴ���
		session.removeAttribute("person");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
