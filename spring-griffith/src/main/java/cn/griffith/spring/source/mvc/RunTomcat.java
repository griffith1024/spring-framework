package cn.griffith.spring.source.mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * 启动内嵌 tomcat
 *
 * @author sunqiang
 * @date 2020-08-18 10:49:18
 */
public class RunTomcat {
	public static void run() {
		// tomcat 需要工作目录
		Tomcat tomcat = new Tomcat();
		try {
			//指定 tomcat 端口
			tomcat.setPort(8888);
			//指定 tomcat 工作文件夹，docBase 是项目目录，比如你的静态主页
			// tomcat.addContext("/","xxx");
			//指定为 web app，以便于调用 ServletContainerInitializer 的实现类
			tomcat.addWebapp("/","/Users/sunqiang/Documents/");
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
