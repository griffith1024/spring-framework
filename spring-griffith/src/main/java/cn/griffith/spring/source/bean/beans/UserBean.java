package cn.griffith.spring.source.bean.beans;

import org.springframework.stereotype.Component;

/**
 * 测试用UserBean
 *
 * @author sunqiang
 * @date 2020-08-16 14:31:57
 */
@Component
public class UserBean {
	public UserBean() {
		System.out.println("实例化UserBean");
	}

	public void printBean() {
		System.out.println("UserBean -------------------");
	}
}
