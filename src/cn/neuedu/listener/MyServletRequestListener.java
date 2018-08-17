package cn.neuedu.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
	System.out.println("request������");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request������"+sre.getServletRequest());
		
	}

}
