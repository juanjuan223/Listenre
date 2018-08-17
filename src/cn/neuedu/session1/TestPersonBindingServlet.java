package cn.neuedu.session1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestPersonBindingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得Session
		HttpSession session=request.getSession();
        //创建一个person
		Person p=new Person();
		p.setId(100);
		p.setName("zhuzhu");
		//将person对象绑到Session中
		session.setAttribute("person", p);
		System.out.println("person放到session中了");
		
		
		//解绑将person对象从session移除掉
		session.removeAttribute("person");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
