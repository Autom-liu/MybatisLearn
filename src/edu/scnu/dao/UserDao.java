package edu.scnu.dao;

import java.util.List;

import edu.scnu.bean.User;

public interface UserDao {
	void save(User user);
	void update(User user);
	void delete(Integer id);
	User find(Integer id);
	List<User> getAll();
	Integer getCount();
	List<User> getByUsername(String username);
	List<User> getByCond(User user);
}
