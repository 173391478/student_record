package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.CriticismService;

@Controller
@RequestMapping("/Criticism")
public class CriticismController {
	private CriticismService criticismService;

	@Autowired
	public void setCriticismService(CriticismService criticismService) {
		this.criticismService = criticismService;
	}

}
