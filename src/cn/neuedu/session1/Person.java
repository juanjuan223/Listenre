package cn.neuedu.session1;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.xml.ws.http.HTTPBinding;

/**
 * 感知监听器不用配web.xml
 * 1.建类 2.建测试类
 * @author dell
 * 对象感知监听器 （是对象自己感知到自己被绑或者解绑）
 * 注册是给对象用的，所以对象来实现接口（HttpSessionBindingListener）
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
	//绑定的方法（何时触发此方法，将Person放到Session中就触发）
	public void valueBound(HttpSessionBindingEvent hbe) {
         System.out.println("Person被绑定了");
		
	}
	@Override
	//解绑的方法（Session把Person对象remove掉就触发）
	public void valueUnbound(HttpSessionBindingEvent hbe) {
		System.out.println("Person被解绑了");
		
	}
	
	
	

}
