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
	 * @RequestMapping���˿������η���������������
	 * @return
	 */
	
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping(){
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
	/**
	 * ʹ��method����ָ������ʽ
	 * @return
	 */
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod(){
		System.out.println("testMethod");
		return SUCCESS;
	}
	/*�˽�ParamsAndHeads�����Ӿ�ȷ��ӳ������ ֧�ּ򵥵ı��ʽ*/
	@RequestMapping(value="/testParamsAndHeads",params={"username","age!=10"})//,headers={"Accept-Language=zh-CN,zh;q=0.9"}
	public String testParamsAndHeads(){
		System.out.println("testParamsAndHeads");
		return SUCCESS;
	}
	/**
	 *  ֧��ant����ͨ���
	 *  ����ʶһ���ַ�
	 *  *��ʶ������ַ�
	 *  **��ʾ���ƥ��·��
	 */
	@RequestMapping("/testAntPath/*/abc")
	public String  testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	/**
	 * @PathVariable ӳ��URL��ռλ��
	 * @PathVariable ע�����ӳ��url�е�ռλ����Ŀ�귽���Ĳ�����
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String  testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable:"+id);
		return SUCCESS;
	}
}
