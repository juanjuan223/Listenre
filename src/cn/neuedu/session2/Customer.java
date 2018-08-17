package cn.neuedu.session2;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
/**
 * 
 * @author dell
 *当用户多时，可实现对对服务器的优化
 *钝化与活化
 *1.写个类 2.写个测试类test1(钝化) 3.写测试类test2(活化)
 *Serializable选io下的，只有序列化才能将数据存到磁盘上（才能钝化到磁盘上）
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
	//活化
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("customer对象被活化了");
		
	}
	@Override
	//钝化
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("customer对象被钝化了");
		
	}

}
