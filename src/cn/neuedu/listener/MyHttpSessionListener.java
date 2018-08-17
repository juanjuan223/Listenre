package cn.neuedu.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	/*jsp�ᴴ����html�����ԣ�ֻ�з�����jsp��session�Żᴴ��,����������ڷ��ʣ����ִ���һ��
	 * ����jsp�ᱻ�������Կ��Դ������ڱ�ͷ��һ��������session=true;
	 * ��������������Լ��������ͻ��ķ�����
	 */
	/**
	 * 1.д��  2.дweb 3.дjsp	 */
	public void sessionCreated(HttpSessionEvent hsp) {
		System.out.println("session������"+hsp.getSession());
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent hsp) {
	    System.out.println("session������");
		
	}

}
