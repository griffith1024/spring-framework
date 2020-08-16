package cn.griffith.spring.source.bean.beans;

import org.springframework.stereotype.Component;

/**
 * 测试用IndexBean
 *
 * @author sunqiang
 * @date 2020-08-16 14:32:17
 */
@Component
public class IndexBean {
	public IndexBean() {
		System.out.println("实例化IndexBean");
	}
	public void printBean() {
		System.out.println("IndexBean -------------------");
	}
}
