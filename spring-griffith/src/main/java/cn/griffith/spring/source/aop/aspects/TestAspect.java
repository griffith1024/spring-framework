package cn.griffith.spring.source.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 测试 aop
 *
 * @author sunqiang
 * @date 2020-08-26 10:43:51
 */
@Component
@Aspect
public class TestAspect {

	@Pointcut("execution(* cn.griffith.spring.source.aop.bean..*.*(..))")
	private void anyPublicOperation() {}

	@Before("anyPublicOperation()")
	public void advice() {
		System.out.println("Before advice -------------------");
	}
}
