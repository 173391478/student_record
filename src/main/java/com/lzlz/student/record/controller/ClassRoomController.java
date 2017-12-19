package com.lzlz.student.record.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.ClassRoomService;

@Controller
@RequestMapping("/ClassRoom")
public class ClassRoomController {
	private ClassRoomService classRoomService;

	public void setClassRoomService(ClassRoomService classRoomService) {
		this.classRoomService = classRoomService;
	}
	
}
