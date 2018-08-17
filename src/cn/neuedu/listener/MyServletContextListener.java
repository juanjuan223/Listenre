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
	//初始化（服务器开启时创建）
	public void contextInitialized(ServletContextEvent sce) {
         //获取被监听的对象
		//ServletContext servletcontext=sce.getServletContext();只针对这一个
		//因为不止一个，所以有通用的方法
		//Object context=sce.getSource();
		ServletContext context=(ServletContext) sce.getSource();//强转
		System.out.println(context);
	    System.out.println("context创建了");
	    /**
	     * 开启一个计息的任务调度，每5秒一次（就是定时器，但是都叫任务调度）
	     */
	    //Timer就是一个定时器工具
	    Timer timer = new Timer();
	    /**
	     * 计时的方法
	     *  timer.scheduleAtFixedRate(task, firstTime, period);
	     *  task：任务，firstTime：第一次执行时间 ，period：间隔执行时间
	     *  TimerTask是接口，不能new,但是可以new内部类
	     */
	    timer.scheduleAtFixedRate(new TimerTask(){
           @Override
			public void run() {
				System.out.println("执行任务了。。5秒一次");
				}
	    	
	    }, new Date(), 5000);
	    
	    /**
	     * 银行计息的方法
	     * 每天0:0:0开始计息，不用new了上面new过了
	     */
	    //装日期格式
	    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    //现在时间
	    String currentTime="2018-08-14 16:50:00";
	    Date parse=null;
	    try {
	    	//将currentTime类型装换为Date类型
			parse=format.parse(currentTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				System.out.println("银行开始计息了。。每天记一次");
				}
	    	
	    }, parse, 24*60*60*1000);
    }

	@Override
	//注销（服务器关闭时销毁）
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context销毁了");
		
	}

}
