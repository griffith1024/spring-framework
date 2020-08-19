package cn.griffith.spring.source.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 *
 * @author sunqiang
 * @date 2020-08-19 10:07:28
 */
public class IocApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocApplication.class);
	}
}
