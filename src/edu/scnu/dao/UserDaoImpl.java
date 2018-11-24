package edu.scnu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import edu.scnu.bean.User;

public class UserDaoImpl implements UserDao {
	
	private SqlSessionFactory sqlSessionFactory;

	
	// 没有spring帮助下，就需要外部手动注入！
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public void save(User user) {
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("user.save", user);
		session.commit();
	}

	@Override
	public void update(User user) {

	}

	@Override
	public void delete(Integer id) {

	}

	@Override
	public User find(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		return session.selectOne("user.findUser", id);
	}

	@Override
	public List<User> getByUsername(String username) {
		SqlSession session = sqlSessionFactory.openSession();
		return session.selectList("user.getByUsername", username);
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public Integer getCount() {
		return null;
	}

	@Override
	public List<User> getByCond(User user) {
		return null;
	}

}
