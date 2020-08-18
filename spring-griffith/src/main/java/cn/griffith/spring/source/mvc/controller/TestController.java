package cn.griffith.spring.source.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试 controller
 *
 * @author sunqiang
 * @date 2020-08-18 11:17:26
 */
@Controller
public class TestController {
	@RequestMapping("/index")
	public String index() {
		System.out.println("controller 访问成功");
		return "success";
	}

	@ResponseBody
	@RequestMapping("map")
	public HashMap<String,String> map() {
		System.out.println("返回");
		HashMap<String,String> map = new HashMap<>();
		map.put("返回","成功");
		return map;
	}
}
