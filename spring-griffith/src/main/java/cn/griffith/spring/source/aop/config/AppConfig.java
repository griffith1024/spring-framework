package cn.griffith.spring.source.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 *
 * @author sunqiang
 * @date 2020-08-26 10:40:59
 */
@ComponentScan("cn.griffith.spring.source.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
