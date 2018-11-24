package edu.scnu.test;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import edu.scnu.bean.User;
import edu.scnu.dao.UserDao;
import edu.scnu.dao.UserDaoImpl;

public class MybatisTest {
	
	private SqlSessionFactory sqlSessionFactory;
	private UserDao userDao;
	
	@Before
	public void before() throws Exception{
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		userDao = new UserDaoImpl(sqlSessionFactory);
	}
	
	@Test
	public void testFind() {
		System.out.println(userDao.find(1));
	}
	
	@Test
	public void testGetByUsername() {
		System.out.println(userDao.getByUsername("�?"));
	}
	
	@Test
	public void testSave() {
		userDao.save(new User("未知用户", "2", new Date(), "中国"));
	}
}
