package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.ProfessCertificateService;

@Controller
@RequestMapping("/ProfessCertificate")
public class ProfessCertificateController {
	private ProfessCertificateService professCertificateService;

	@Autowired
	public void setProfessCertificateService(ProfessCertificateService professCertificateService) {
		this.professCertificateService = professCertificateService;
	}

}
