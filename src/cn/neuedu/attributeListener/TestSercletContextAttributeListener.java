package cn.neuedu.attributeListener;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestSercletContextAttributeListener extends HttpServlet {
	/**
	 * �����࣬�������Լ�����
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ö���
		//��ctrl+2����ַ���ֵ��ѡ�ѡ����Ҫ��
		 ServletContext context = this.getServletContext();
		
		//��context���д�����(������Ϊtom�Ķ������)
		 context.setAttribute("name", "tom");
		
		//��context��������(��tom�ĳ�lucy)
		 context.setAttribute("name", "lucy");
		
		//ɾ��context��������(ɾ������)
		 context.removeAttribute("name");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
