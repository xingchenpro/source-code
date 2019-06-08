package com.javahly.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/25
 * @QQ :1136513099
 * @desc :
 */
@Scope
@Component
public class IndexDao {

	public IndexDao() {
		System.out.println("构造方法");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	public void query(){
		System.out.println("query......");
	}
}
