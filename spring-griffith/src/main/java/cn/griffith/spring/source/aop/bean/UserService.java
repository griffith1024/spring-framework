package cn.griffith.spring.source.aop.bean;

import org.springframework.stereotype.Component;

/**
 * 测试类
 *
 * @author sunqiang
 * @date 2020-08-26 10:42:06
 */
@Component
public class UserService {
	public UserService() {
		System.out.println("测试类 UserService 实例化完成");
	}

	public void print(){
		System.out.println("这是个 UserService");
	}
}
