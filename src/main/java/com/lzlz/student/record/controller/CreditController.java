package com.lzlz.student.record.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzlz.student.record.service.CreditService;

@Controller
@RequestMapping("/Credit")
public class CreditController {
	private CreditService creditService;

	@Autowired
	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}

}
