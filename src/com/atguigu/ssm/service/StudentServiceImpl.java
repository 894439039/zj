package com.atguigu.ssm.service;

import com.atguigu.ssm.beans.student;
import com.atguigu.ssm.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper ;
	
	@Override
	public List<student> getAllEmps() {
		return studentMapper.getAllEmps();
	}
}
