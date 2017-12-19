package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.ProfessCertificateDAO;
import com.lzlz.student.record.service.ProfessCertificateService;

@Service("professCertificateService")
public class ProfessCertificateServiceImpl implements ProfessCertificateService{
	private ProfessCertificateDAO professCertificateDAO;

	@Autowired
	public void setProfessCertificateDAO(ProfessCertificateDAO professCertificateDAO) {
		this.professCertificateDAO = professCertificateDAO;
	}

}
