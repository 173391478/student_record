package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.CreditDAO;
import com.lzlz.student.record.service.CreditService;

@Service("creditServiceImpl")
public class CreditServiceImpl implements CreditService{
	private CreditDAO creditDAO;

	@Autowired
	public void setCreditDAO(CreditDAO creditDAO) {
		this.creditDAO = creditDAO;
	}

}
