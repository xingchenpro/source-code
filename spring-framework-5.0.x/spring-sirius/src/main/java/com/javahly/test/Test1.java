package com.javahly.test;

import com.javahly.config.AppConfig;
import com.javahly.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/5/25
 * @QQ :1136513099
 * @desc :
 */

public class Test1 {

	public static void main(String[] args){
		//把Spring所有的前提环境准备好
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);

		indexDao.query();
	}
}
