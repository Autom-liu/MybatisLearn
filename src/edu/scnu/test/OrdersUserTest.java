package edu.scnu.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import edu.scnu.dao.OrdersDao;
import edu.scnu.dao.OrdersUserDao;

public class OrdersUserTest {
	private SqlSessionFactory sqlSessionFactory;
	private OrdersUserDao orderDao;
	
	@Before
	public void before() throws Exception{
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession(true);
		orderDao = session.getMapper(OrdersUserDao.class);
	}
	
	@Test
	public void testGet() {
		System.out.println(orderDao.queryAll());
	}
}
