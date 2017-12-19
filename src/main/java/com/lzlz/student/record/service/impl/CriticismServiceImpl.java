package com.lzlz.student.record.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzlz.student.record.dao.CriticismDAO;
import com.lzlz.student.record.service.CriticismService;

@Service("criticismService")
public class CriticismServiceImpl implements CriticismService{
	private CriticismDAO criticismDAO;

	@Autowired
	public void setCriticismDAO(CriticismDAO criticismDAO) {
		this.criticismDAO = criticismDAO;
	}

}
