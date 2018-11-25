package edu.scnu.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.scnu.bean.User;
import edu.scnu.dao.UserDao;

public class SpringUserTest {
	
	private ApplicationContext context;
	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void testFind() {
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = userDao.find(1);
		System.out.println(user);
	}
}
