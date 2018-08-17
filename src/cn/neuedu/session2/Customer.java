package cn.neuedu.session2;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
/**
 * 
 * @author dell
 *���û���ʱ����ʵ�ֶԶԷ��������Ż�
 *�ۻ���
 *1.д���� 2.д��������test1(�ۻ�) 3.д������test2(�)
 *Serializableѡio�µģ�ֻ�����л����ܽ����ݴ浽�����ϣ����ܶۻ��������ϣ�
 */
public class Customer implements HttpSessionActivationListener,Serializable{
	private int id;
	private String name;
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
	@Override
	//�
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("customer���󱻻��");
		
	}
	@Override
	//�ۻ�
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("customer���󱻶ۻ���");
		
	}

}
