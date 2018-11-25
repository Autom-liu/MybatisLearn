package edu.scnu.test;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import edu.scnu.bean.User;
import edu.scnu.bean.UserWrapper;
import edu.scnu.dao.UserDao;

public class MybatisTest {
	
	private SqlSessionFactory sqlSessionFactory;
	private UserDao userDao;
	
	@Before
	public void before() throws Exception{
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		userDao = session.getMapper(UserDao.class);
	}
	
	@Test
	public void testFind() {
		System.out.println(userDao.find(1));
	}
	
	@Test
	public void testGetByUsername() {
		System.out.println(userDao.getByUsername("王"));
	}
	
	@Test
	public void testSelect() {
		System.out.println(userDao.getAll());
		System.out.println(userDao.getCount());
	}
	
	@Test
	public void testSave() {
		User u = new User("未知用户", "2", new Date(), "中国");
		userDao.save(u);
		System.out.println(u.getId());
	}
	
	@Test
	public void testUpdate() {
		User u = new User("未知用户2", "1", new Date(), "中国");
		u.setId(1);
		userDao.update(new UserWrapper(u));
	}
}
