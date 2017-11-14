package com.cskt.dao;

import java.util.List;

import com.cskt.pojo.Hiber;

public interface HiberMapper {
	public List<Hiber> getAll();
	public int removeHiber(int id);
}
