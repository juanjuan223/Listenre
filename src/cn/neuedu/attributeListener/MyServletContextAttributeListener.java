package cn.neuedu.attributeListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener{

	@Override
	/**
	 * ���������������������һ����
	 * 
	 * ��3��  1.д��   2.��web�������� 3.��һ�����Ե��ࣨjsp����servlet�����ԣ��õ���servlet��
	 */
	public void attributeAdded(ServletContextAttributeEvent sab){
		//�ŵ����е�����
	   System.out.println("��ȡ�ŵ����е�name��"+sab.getName());//��ȡ�ŵ����е�name
	   System.out.println("��ȡ�ŵ����е�value��"+sab.getValue());//��ȡ�ŵ����е�value
	   
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent sab) {
		
	   System.out.println("��ȡɾ�����е�������"+sab.getName());//��ȡɾ�����е�����
	   System.out.println("��ȡɾ�����е�value��"+sab.getValue());//��ȡɾ�����е�value
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent sab) {
		 System.out.println("��ȡ�޸�ǰ��name��"+sab.getName());//��ȡ�޸�ǰ��name
		 System.out.println("��ȡ�޸�ǰ��ֵ��"+sab.getValue());//��ȡ�޸�ǰ��ֵ
		
	}

}
