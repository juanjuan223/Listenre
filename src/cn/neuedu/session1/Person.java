package cn.neuedu.session1;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.xml.ws.http.HTTPBinding;

/**
 * ��֪������������web.xml
 * 1.���� 2.��������
 * @author dell
 * �����֪������ ���Ƕ����Լ���֪���Լ�������߽��
 * ע���Ǹ������õģ����Զ�����ʵ�ֽӿڣ�HttpSessionBindingListener��
 *
 */
public class Person implements HttpSessionBindingListener{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
	@Override
	//�󶨵ķ�������ʱ�����˷�������Person�ŵ�Session�оʹ�����
	public void valueBound(HttpSessionBindingEvent hbe) {
         System.out.println("Person������");
		
	}
	@Override
	//���ķ�����Session��Person����remove���ʹ�����
	public void valueUnbound(HttpSessionBindingEvent hbe) {
		System.out.println("Person�������");
		
	}
	
	
	

}
