package cn.griffith.spring.source.bean.exts;

import cn.griffith.spring.source.bean.beans.IndexBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * beanDefination扩展
 *
 * @author sunqiang
 * @date 2020-08-16 18:33:38
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition userBean = (GenericBeanDefinition) beanFactory.getBeanDefinition("userBean");
		userBean.setBeanClass(IndexBean.class);
	}
}
