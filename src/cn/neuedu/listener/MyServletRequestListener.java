package cn.neuedu.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
	System.out.println("request销毁了");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request创建了"+sre.getServletRequest());
		
	}

}
