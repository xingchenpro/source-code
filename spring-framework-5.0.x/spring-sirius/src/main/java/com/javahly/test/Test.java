package com.javahly.test;

import com.javahly.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/25
 * @QQ :1136513099
 * @desc :
 */

public class Test {

	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(UserDao.class);
		annotationConfigApplicationContext.refresh();
		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDao");
		userDao.query();

	}
}
