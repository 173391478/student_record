package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.GeneralCertificateDAO;
import com.lzlz.student.record.service.GeneralCertificateService;

@Service("generalCertificateService")
public class GeneralCertificateServiceImpl implements GeneralCertificateService{
	private GeneralCertificateDAO generalCertificateDAO;

	@Autowired
	public void setGeneralCertificateDAO(GeneralCertificateDAO generalCertificateDAO) {
		this.generalCertificateDAO = generalCertificateDAO;
	}

}
