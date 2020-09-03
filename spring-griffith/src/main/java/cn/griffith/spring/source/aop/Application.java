package cn.griffith.spring.source.aop;

import cn.griffith.spring.source.aop.bean.UserService;
import cn.griffith.spring.source.aop.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * aop 启动类
 *
 * @author sunqiang
 * @date 2020-08-26 10:40:34
 */
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService bean = context.getBean(UserService.class);
		bean.print();
	}
}
