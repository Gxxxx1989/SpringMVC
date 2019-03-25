package com.guoxi.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc")
public class SpringmvcTest {
	private static final String SUCCESS="success";
	
	
	/**
	 * @RequestMapping除了可以修饰方法还可以修饰类
	 * @return
	 */
	
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping(){
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
	/**
	 * 使用method属性指定请求方式
	 * @return
	 */
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod(){
		System.out.println("testMethod");
		return SUCCESS;
	}
	/*了解ParamsAndHeads来更加精确的映射请求 支持简单的表达式*/
	@RequestMapping(value="/testParamsAndHeads",params={"username","age!=10"})//,headers={"Accept-Language=zh-CN,zh;q=0.9"}
	public String testParamsAndHeads(){
		System.out.println("testParamsAndHeads");
		return SUCCESS;
	}
	/**
	 *  支持ant风格的通配符
	 *  ？标识一个字符
	 *  *标识任意个字符
	 *  **表示多层匹配路径
	 */
	@RequestMapping("/testAntPath/*/abc")
	public String  testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	/**
	 * @PathVariable 映射URL绑定占位符
	 * @PathVariable 注解可以映射url中的占位符到目标方法的参数中
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String  testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable:"+id);
		return SUCCESS;
	}
}
