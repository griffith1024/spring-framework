package cn.griffith.spring.source.aop.service;

import org.springframework.stereotype.Component;

/**
 * 测试类
 *
 * @author sunqiang
 * @date 2020-08-24 21:03:55
 */
@Component
public class UserService {
	public void query() {
		System.out.println("调用 UserService 的 query 方法");
	}
}
