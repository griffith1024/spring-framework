package cn.griffith.spring.source.mvc.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 配置
 *
 * @author sunqiang
 * @date 2020-08-18 11:22:45
 */
@Configuration
@ComponentScan("cn.griffith.spring.source.mvc")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
	/**
	 * 添加 Converter，即 json 转换器、视图转换器等
	 * 使用 @EnableWebMvc 使其生效
	 * @param converters initially an empty list of converters
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		System.out.println("添加 json 解析器");
		converters.add(new FastJsonHttpMessageConverter());
	}
}
