package com.javahly.test;


import com.javahly.beanFactoryPostProcessor.TestBeanFactoryPostProcessor;
import com.javahly.beanPostProcessor.TestBeanPostProcessor;
import com.javahly.config.AppConfig;
import com.javahly.dao.IndexDao;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/11
 * @QQ :1136513099
 * @desc :
 */
public class Test2 {

public static void main(String[] args){
	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
	annotationConfigApplicationContext.register(AppConfig.class);
	//org.springframework.context.support.AbstractApplicationContext.getBeanFactoryPostProcessors()
	//getBeanFactoryPostProcessors() 得到自己定义的（就是程序员自己写的，并且没有交给spring管理，就是没有加上@Component）
	annotationConfigApplicationContext.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());
	annotationConfigApplicationContext.refresh();
	IndexDao indexDao2 = annotationConfigApplicationContext.getBean(IndexDao.class);
	IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
	System.out.println(indexDao+" "+indexDao2);
}


}
