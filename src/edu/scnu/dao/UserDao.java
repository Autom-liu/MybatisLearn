package edu.scnu.dao;

import java.util.List;

import edu.scnu.bean.User;
import edu.scnu.bean.UserWrapper;

public interface UserDao {
	void save(User user);
	void update(UserWrapper uwrap);
	void delete(Integer id);
	User find(Integer id);
	List<User> getAll();
	Integer getCount();
	List<User> getByUsername(String username);
	List<User> getByCond(User user);
	List<User> getByIds(Integer[] ids);
	List<User> getByIds(List<Integer> ids);
	List<User> getByIds(UserWrapper uwrap);
	List<User> getWithOrders();
}
