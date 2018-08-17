package cn.neuedu.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	/*jsp会创建，html不可以，只有访问了jsp，session才会创建,换个浏览器在访问，就又创建一个
	 * 访问jsp会被翻译所以可以创建，在表头有一个隐含的session=true;
	 * 这个监听器，可以计数，做客户的访问数
	 */
	/**
	 * 1.写类  2.写web 3.写jsp	 */
	public void sessionCreated(HttpSessionEvent hsp) {
		System.out.println("session创建了"+hsp.getSession());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent hsp) {
	    System.out.println("session销毁了");
		
	}

}
