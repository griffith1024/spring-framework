package cn.griffith.spring.source.bean;

import cn.griffith.spring.source.bean.beans.IndexBean;
import cn.griffith.spring.source.bean.beans.UserBean;
import cn.griffith.spring.source.bean.config.BeanScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * bean相关测试启动类
 *
 * @author sunqiang
 * @date 2020-08-16 14:31:22
 */
public class BeanApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanScan.class);
		System.out.println(context.getBeanDefinitionNames());
		Object indexBean = context.getBean("indexBean");
		Object userBean = context.getBean("userBean");
	}
}
