package cn.griffith.spring.source.mvc;

import cn.griffith.spring.source.mvc.config.AppConfig;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;

/**
 * 启动内嵌 tomcat
 *
 * @author sunqiang
 * @date 2020-08-18 10:49:18
 */
public class RunWebApp {
	public static void run() {
		// tomcat 需要工作目录
		Tomcat tomcat = new Tomcat();
		try {
			//指定 tomcat 端口
			tomcat.setPort(8888);
			//指定 tomcat 工作文件夹，docBase 是项目目录，比如你的静态主页
			tomcat.addContext("/","/Users/sunqiang/Documents/");
			//初始化 Spring web 应用
			AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
			context.register(AppConfig.class);
			// 这样的话一定不能调用 refresh()方法，如果加了会重复执行。下面 DispatcherServlet 也会调用一次 refresh() 方法
			// context.refresh();
			//通过 tomcat ，这是只需要指定 addContext 就可以，注册servlet,必须关联 上下文，以便于用 appConfi.class 代替 spring.xml
			DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
			Wrapper mvc = tomcat.addServlet("/", "mvc", dispatcherServlet);
			mvc.setLoadOnStartup(1);
			//拦截请求
			mvc.addMapping("/");
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}
}
