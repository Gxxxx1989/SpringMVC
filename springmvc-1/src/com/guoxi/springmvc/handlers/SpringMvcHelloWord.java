package com.guoxi.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMvcHelloWord {
	/**
	 * 1使用@RequestMapping 注解映射请求url
	 * 2返回值通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器会做如下解析
	 * prefix+returnval+后缀 这样的方式得到实际的物理视图，然后做转发操作
	 * 即:/WEB-INF/views+success+.jsp
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("nihao ");
		return "success";
	}
}
