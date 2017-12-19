package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.GeneralCertificateService;

@Controller
@RequestMapping("/GeneralCertificate")
public class GeneralCertificateController {
	private GeneralCertificateService generalCertificateService;

	@Autowired
	public void setGeneralCertificateService(GeneralCertificateService generalCertificateService) {
		this.generalCertificateService = generalCertificateService;
	}

}
