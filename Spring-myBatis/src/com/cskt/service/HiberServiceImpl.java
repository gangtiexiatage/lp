package com.cskt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cskt.dao.HiberMapper;
import com.cskt.pojo.Hiber;

//service就是业务逻辑层专用注解
//相当于在applicationContext创建了一个bean id为hs
@Service("hs")
public class HiberServiceImpl implements HiberService {
	//@Autowired 按照对象的类型自动搜索其他包来进行注入
	@Autowired
	private HiberMapper hm;
	public HiberMapper getHm() {
		return hm;
	}

	public void setHm(HiberMapper hm) {
		this.hm = hm;
	}

	public List<Hiber> getAll() {
		//业务逻辑层调用数据访问层
		return hm.getAll();
	}

	public int removeHiber(int id) {
		// TODO Auto-generated method stub
		return hm.removeHiber(id);
	}

}
