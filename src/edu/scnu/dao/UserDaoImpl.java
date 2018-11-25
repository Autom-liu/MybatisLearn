package edu.scnu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import edu.scnu.bean.User;
import edu.scnu.bean.UserWrapper;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		SqlSession sqlSession = super.getSqlSession();
		sqlSession.insert("test.save", user);
		// 无需关闭和提交事务，由spring管理
	}

	@Override
	public void update(UserWrapper uwrap) {
		SqlSession sqlSession = super.getSqlSession();
		sqlSession.update("test.update", uwrap);
	}

	@Override
	public void delete(Integer id) {
		SqlSession sqlSession = super.getSqlSession();
		sqlSession.delete("test.delete", id);
		// 无需关闭和提交事务，由spring管理
	}

	@Override
	public User find(Integer id) {
		SqlSession sqlSession = super.getSqlSession();
		User u =  sqlSession.selectOne("test.find", id);
		// 无需关闭，由spring管理
		return u;
	}

	@Override
	public List<User> getAll() {
		SqlSession sqlSession = super.getSqlSession();
		List<User> ul =  sqlSession.selectList("test.getAll");
		return ul;
	}

	@Override
	public Integer getCount() {
		SqlSession sqlSession = super.getSqlSession();
		return sqlSession.selectOne("test.getCount");
	}

	@Override
	public List<User> getByUsername(String username) {
		SqlSession sqlSession = super.getSqlSession();
		List<User> ul =  sqlSession.selectList("test.getByUsername");
		return ul;
	}

	@Override
	public List<User> getByCond(User user) {
		SqlSession sqlSession = super.getSqlSession();
		List<User> ul =  sqlSession.selectList("test.getByCond");
		return ul;
	}

	@Override
	public List<User> getByIds(Integer[] ids) {
		SqlSession sqlSession = super.getSqlSession();
		List<User> ul =  sqlSession.selectList("test.getByIds");
		return ul;
	}

	@Override
	public List<User> getByIds(List<Integer> ids) {
		return null;
	}

	@Override
	public List<User> getByIds(UserWrapper uwrap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getWithOrders() {
		return null;
	}

}
