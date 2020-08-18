package cn.griffith.spring.source.mvc.inits;

import cn.griffith.spring.source.mvc.config.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * DispatcherServlet 初始化
 *
 * 通过实现 WebApplicationInitializer 的 onStartup 接口，
 * new 一个 DispatcherServlet，
 * 把这个 servlet add 到 servletContext 中，
 * 这样就把一个 servlet 给了 tomcat 容器，
 * 完成了对一个 servlet 的注册
 * 然后通过registration.setLoadOnStartup(1)启动
 *
 * @author sunqiang
 * @date 2020-08-18 09:54:53
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
		//初始化 Spring web 应用
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		//注册servlet,必须关联 上下文，以便于用 appConfi.class 代替 spring.xml
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("mvc", dispatcherServlet);
		registration.setLoadOnStartup(1);
		//拦截请求
		registration.addMapping("/");
	}
}
