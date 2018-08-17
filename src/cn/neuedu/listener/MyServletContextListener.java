package cn.neuedu.listener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements  ServletContextListener{

	@Override
	//��ʼ��������������ʱ������
	public void contextInitialized(ServletContextEvent sce) {
         //��ȡ�������Ķ���
		//ServletContext servletcontext=sce.getServletContext();ֻ�����һ��
		//��Ϊ��ֹһ����������ͨ�õķ���
		//Object context=sce.getSource();
		ServletContext context=(ServletContext) sce.getSource();//ǿת
		System.out.println(context);
	    System.out.println("context������");
	    /**
	     * ����һ����Ϣ��������ȣ�ÿ5��һ�Σ����Ƕ�ʱ�������Ƕ���������ȣ�
	     */
	    //Timer����һ����ʱ������
	    Timer timer = new Timer();
	    /**
	     * ��ʱ�ķ���
	     *  timer.scheduleAtFixedRate(task, firstTime, period);
	     *  task������firstTime����һ��ִ��ʱ�� ��period�����ִ��ʱ��
	     *  TimerTask�ǽӿڣ�����new,���ǿ���new�ڲ���
	     */
	    timer.scheduleAtFixedRate(new TimerTask(){
           @Override
			public void run() {
				System.out.println("ִ�������ˡ���5��һ��");
				}
	    	
	    }, new Date(), 5000);
	    
	    /**
	     * ���м�Ϣ�ķ���
	     * ÿ��0:0:0��ʼ��Ϣ������new������new����
	     */
	    //װ���ڸ�ʽ
	    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    //����ʱ��
	    String currentTime="2018-08-14 16:50:00";
	    Date parse=null;
	    try {
	    	//��currentTime����װ��ΪDate����
			parse=format.parse(currentTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				System.out.println("���п�ʼ��Ϣ�ˡ���ÿ���һ��");
				}
	    	
	    }, parse, 24*60*60*1000);
    }

	@Override
	//ע�����������ر�ʱ���٣�
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context������");
		
	}

}
