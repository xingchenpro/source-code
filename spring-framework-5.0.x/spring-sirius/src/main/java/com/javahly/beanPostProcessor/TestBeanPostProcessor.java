package com.javahly.beanPostProcessor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/6/9
 * @QQ :1136513099
 * @desc :
 */

/**
 * PriorityOrdered Bean初始化的一个顺序
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor,PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("beforeInitialization");
		}
		//可以把这里的bean改成代理对象返回出去
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("afterInitialization");
		}
		return bean;
	}

	/**
	 * 值越小，越优先
	 * @return
	 */
	@Override
	public int getOrder() {
		return 0;
	}
}
