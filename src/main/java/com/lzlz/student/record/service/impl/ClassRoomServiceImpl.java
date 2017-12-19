package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ClassRoomDAO;
import com.lzlz.student.record.service.ClassRoomService;

@Service("classRoomService")
public class ClassRoomServiceImpl implements ClassRoomService{
	private ClassRoomDAO classRoomDAO;

	@Autowired
	public void setClassRoomDAO(ClassRoomDAO classRoomDAO) {
		this.classRoomDAO = classRoomDAO;
	}

}
