package com.cskt.test;

import java.util.List;

import oracle.net.aso.h;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cskt.dao.HiberMapper;
import com.cskt.pojo.Hiber;
import com.cskt.service.HiberService;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//接口映射器生成的bean名字	首字母为小写
		HiberService hm=(HiberService)ac.getBean("hs");
		
		int num=hm.removeHiber(5);
		System.out.println(num);
	}

}
