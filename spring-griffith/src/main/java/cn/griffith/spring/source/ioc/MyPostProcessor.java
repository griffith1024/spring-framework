package cn.griffith.spring.source.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 自定义后置处理器
 *
 * 所有实现了 BeanPostProcessor 的接口都可以称之为后置处理器
 * 后置处理器通过 postProcessBeforeInitialization 和 postProcessAfterInitialization 实现前置和后置的一个处理
 * @author sunqiang
 * @date 2020-08-24 14:45:14
 */
@Component
public class MyPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName);
		return bean;
	}
}
