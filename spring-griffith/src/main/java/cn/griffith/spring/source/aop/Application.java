package cn.griffith.spring.source.aop;

import cn.griffith.spring.source.aop.config.AppConfig;
import cn.griffith.spring.source.aop.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AOP 启动类
 *
 * @author sunqiang
 * @date 2020-08-24 21:01:25
 */
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// 加了切面后， bean 的对象实际上被改变了
		UserService bean = context.getBean(UserService.class);
		bean.query();
	}
}
