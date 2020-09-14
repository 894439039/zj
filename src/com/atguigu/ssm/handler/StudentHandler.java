package com.atguigu.ssm.handler;

import com.atguigu.ssm.beans.student;
import com.atguigu.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class StudentHandler {
	
	@Autowired
	private StudentService studentService ;
	
	/**
	 * 显示所有的员工信息
	 */
	@RequestMapping(value="/emps" ,method= RequestMethod.GET)
	public String  listAllEmps(Map<String, Object> map) {
		List<student> emps = studentService.getAllEmps();
		map.put("emps", emps);
		return "list";
	}
}
