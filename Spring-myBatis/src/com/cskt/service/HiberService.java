package com.cskt.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cskt.dao.HiberMapper;
import com.cskt.pojo.Hiber;

@Transactional(propagation=Propagation.REQUIRED)
public interface HiberService {
	public List<Hiber> getAll();
	public int removeHiber(int id);
}
